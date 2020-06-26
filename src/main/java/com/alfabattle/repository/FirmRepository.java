package com.alfabattle.repository;

import com.alfabattle.model.Firm;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 21:11
 */
public interface FirmRepository {

  void save(@NotNull Firm firm);

  @NotNull
  Optional<Long> findByNameAndCountry(@NotNull String name, @NotNull String countryName);
}
