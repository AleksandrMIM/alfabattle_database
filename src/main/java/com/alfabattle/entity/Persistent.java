package com.alfabattle.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 20:53
 */
@MappedSuperclass
@EqualsAndHashCode
@Getter
@Setter
public class Persistent {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
}
