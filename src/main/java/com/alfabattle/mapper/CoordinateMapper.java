package com.alfabattle.mapper;

import com.alfabattle.entity.CoordinateEntity;
import com.alfabattle.model.Coordinate;
import org.mapstruct.Mapper;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 11:45
 */
@Mapper(componentModel = "spring")
public interface CoordinateMapper {

  Coordinate map(CoordinateEntity rates);

  CoordinateEntity map(Coordinate rates);
}
