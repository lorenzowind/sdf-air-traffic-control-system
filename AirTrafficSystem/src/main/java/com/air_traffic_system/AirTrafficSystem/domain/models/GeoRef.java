package com.air_traffic_system.AirTrafficSystem.domain.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GeoRef {
  @Id
  private String id;
  private String name;
  private Float latitude;
  private Float longitude;

  public GeoRef() {}

  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public Float getLatitude() {
    return latitude;
  }
  public Float getLongitude() {
    return longitude;
  }
}
