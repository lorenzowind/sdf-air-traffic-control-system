package com.air_traffic_system.AirTrafficSystem.domain.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AirRoute {
  @Id
  private String id;
  private String name;

  @OneToMany(fetch = FetchType.EAGER,
              mappedBy = "airroute", 
              cascade = CascadeType.ALL)
  private List<Airplane> airplanes;

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
