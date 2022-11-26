package com.air_traffic_system.AirTrafficSystem.domain.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "geo_refs")
public class GeoRef {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
