package com.alfabattle.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 20:55
 */
@Entity
@Table(name = "firm")
@Getter
@Setter
@ToString
public class FirmEntity extends Persistent {

  private String name;
  @ManyToOne
  @JoinColumn(name = "coordinate_id")
  private CoordinateEntity coordinate;
  @ManyToMany(cascade = CascadeType.MERGE, mappedBy = "firmSet")
  private Set<CountryEntity> countrySet;
}
