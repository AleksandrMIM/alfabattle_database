package com.alfabattle.mapper;

import com.alfabattle.entity.FirmEntity;
import com.alfabattle.model.Firm;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 11:45
 */
@Mapper(componentModel = "spring")
@MapperConfig(uses = CoordinateMapper.class)
public interface FirmMapper {

  @Mapping(target = "countrySet", ignore = true)
  Firm map(FirmEntity rates);

  @Mapping(target = "countrySet", ignore = true)
  FirmEntity map(Firm rates);
}
