package com.alfabattle.repository;

import com.alfabattle.dao.CoordinateDao;
import com.alfabattle.dao.CountryDao;
import com.alfabattle.dao.FirmDao;
import com.alfabattle.entity.FirmEntity;
import com.alfabattle.mapper.CountryMapper;
import com.alfabattle.mapper.FirmMapper;
import com.alfabattle.model.Firm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 21:31
 */
@Repository
@RequiredArgsConstructor
@Slf4j
@Transactional
public class FirmRepositoryImpl implements FirmRepository {

  private final FirmDao firmDao;
  private final CoordinateDao coordinateDao;
  private final CountryDao countryDao;
  private final FirmMapper firmMapper;
  private final CountryMapper countryMapper;

  @Override
  public void save(@NotNull Firm firm) {
    var firmEntity = firmMapper.map(firm);
    var coordinateEntity = coordinateDao.findById(1L);
    var countryEntity = countryDao.save(firm.getCountrySet()
        .stream()
        .map(countryMapper::map)
        .peek(ce -> ce.setFirmSet(new HashSet<>()))
        .findFirst()
        .get()
    );
    firmEntity.setCoordinate(coordinateEntity.get());
    firmEntity.setCountrySet(new HashSet<>());
    firmEntity.getCountrySet().add(countryEntity);
    var firmEntityNew = firmDao.save(firmEntity);
//    firmDao.insertFirmCountry(countryEntity.getId(), firmEntity.getId());
    logger.info(firmEntityNew.toString());
  }

  @Override
  public @NotNull Optional<Long> findByNameAndCountry(@NotNull String name, @NotNull String countryName) {
    return firmDao.findByNameAndCountry(name, countryName);
  }
}
