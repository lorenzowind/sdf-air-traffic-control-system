package com.air_traffic_system.AirTrafficSystem.domain.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airway_occupations")
public class AirwayOccupation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private Date date;
  private Integer altitude;

  public AirwayOccupation() {}

  public String getId() {
    return id;
  }
  public Date getDate() {
    return date;
  }
  public Integer getAltitude() {
    return altitude;
  }  
}
