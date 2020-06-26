package com.alfabattle.dao;

import com.alfabattle.entity.CountryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 21:08
 */
public interface CountryDao extends CrudRepository<CountryEntity, Long> {

  Optional<CountryEntity> findByName(String name);
}
