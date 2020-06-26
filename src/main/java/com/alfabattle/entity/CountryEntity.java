package com.alfabattle.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 21:02
 */
@Entity
@Table(name = "country")
@Getter
@Setter
@ToString
public class CountryEntity extends Persistent {

  private String name;
  @ManyToMany
  @JoinTable(
      name = "firm_country",
      joinColumns = @JoinColumn(name = "country_id"),
      inverseJoinColumns = @JoinColumn(name = "firm_id")
  )
  private Set<FirmEntity> firmSet;
}
