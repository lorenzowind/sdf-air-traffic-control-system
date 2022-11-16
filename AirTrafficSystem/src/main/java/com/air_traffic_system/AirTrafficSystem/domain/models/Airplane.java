package com.air_traffic_system.AirTrafficSystem.domain.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airplane {
  @Id
  private String id;
  private String prefix;
  private Float cruisingSpeed;
  private Integer autonomy;

  public Airplane() {}
  
  public String getId() {
    return id;
  }
  public String getPrefix() {
    return prefix;
  }
  public Float getCruisingSpeed() {
    return cruisingSpeed;
  }
  public Integer getAutonomy() {
    return autonomy;
  }
}
