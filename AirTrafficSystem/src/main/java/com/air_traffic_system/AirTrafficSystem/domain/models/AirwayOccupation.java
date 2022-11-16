package com.air_traffic_system.AirTrafficSystem.domain.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AirwayOccupation {
  @Id
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
