package com.alfabattle.mapper;

import com.alfabattle.entity.CountryEntity;
import com.alfabattle.model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 21:20
 */
@Mapper(componentModel = "spring")
public interface CountryMapper {

  @Mapping(target = "firmSet", ignore = true)
  Country map(CountryEntity countryEntity);

  @Mapping(target = "firmSet", ignore = true)
  CountryEntity map(Country countryEntity);
}
