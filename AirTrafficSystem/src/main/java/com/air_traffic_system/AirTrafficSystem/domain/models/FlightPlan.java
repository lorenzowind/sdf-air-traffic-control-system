package com.air_traffic_system.AirTrafficSystem.domain.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FlightPlan {
  @Id
  private String id;
  private Date date;
  private Float altitude;
  private Float cruisingSpeed;

  public FlightPlan() {}

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name="id", nullable=false)
  private Airplane airplane;

  public String getId() {
    return id;
  }
  public Date getDate() {
    return date;
  }
  public Float getAltitude() {
    return altitude;
  }
  public Float getCruisingSpeed() {
    return cruisingSpeed;
  }
}
