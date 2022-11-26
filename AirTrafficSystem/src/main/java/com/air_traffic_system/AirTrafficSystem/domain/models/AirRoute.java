package com.air_traffic_system.AirTrafficSystem.domain.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "air_routes")
public class AirRoute {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String name;

  @OneToMany(fetch = FetchType.EAGER,
             mappedBy = "airroute", 
             cascade = CascadeType.ALL)
  private List<Airway> airways;

  public AirRoute() {}
  
  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
}
