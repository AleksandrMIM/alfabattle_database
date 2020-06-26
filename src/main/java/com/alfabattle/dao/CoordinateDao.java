package com.alfabattle.dao;

import com.alfabattle.entity.CoordinateEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 21:08
 */
public interface CoordinateDao extends CrudRepository<CoordinateEntity, Long> {

  Optional<CoordinateEntity> findByLatitudeAndLongitude(String latitude, String longitude);
}
