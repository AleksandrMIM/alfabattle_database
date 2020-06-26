package com.alfabattle.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 21:17
 */
@Getter
@Setter
public class Firm {

  private Long id;
  private String name;
  private Coordinate coordinate;
  private Set<Country> countrySet;
}
