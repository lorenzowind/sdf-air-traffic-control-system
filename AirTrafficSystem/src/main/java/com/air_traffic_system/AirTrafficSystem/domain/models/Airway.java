package com.air_traffic_system.AirTrafficSystem.domain.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "airways")
public class Airway {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String name;

  public Airway() {}

  @OneToMany(fetch = FetchType.EAGER,
             mappedBy = "airway", 
             cascade = CascadeType.ALL)
  private List<AirwayOccupation> airwayOccupations;

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name="id", nullable=false)
  private GeoRef from;
  
  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name="id", nullable=false)
  private GeoRef to;

  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public GeoRef getFrom() {
    return from;
  }
  public GeoRef getTo() {
    return to;
  }
}
