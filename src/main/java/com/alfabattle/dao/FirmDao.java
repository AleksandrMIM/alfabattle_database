package com.alfabattle.dao;

import com.alfabattle.entity.FirmEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 21:08
 */
public interface FirmDao extends CrudRepository<FirmEntity, Long> {

//  @Query(value = "insert into firm_country(firm_id, country_id) values (:firm, :country)", nativeQuery = true)
//  void insertFirmCountry(@Param("firm") Long firm,
//                         @Param("country") Long country);

  @Query("select count(fe) from FirmEntity fe join fe.countrySet ce where fe.name = :name and ce.name = :countryName")
  Optional<Long> findByNameAndCountry(@Param("name") String name,
                                      @Param("countryName") String countryName);
}
