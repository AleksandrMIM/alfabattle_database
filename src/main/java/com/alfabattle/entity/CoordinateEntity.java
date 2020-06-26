package com.alfabattle.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 20:52
 */
@Entity
@Table(name = "coordinate")
@Getter
@Setter
@ToString
public class CoordinateEntity extends Persistent {

  private String longitude;
  private String latitude;
}
