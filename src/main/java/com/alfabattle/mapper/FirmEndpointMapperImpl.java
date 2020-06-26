package com.alfabattle.mapper;

import com.alfabattle.api.TestRequest;
import com.alfabattle.api.TestResponse;
import com.alfabattle.model.Country;
import com.alfabattle.model.Firm;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.HashSet;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 21:49
 */
@Component
public class FirmEndpointMapperImpl implements FirmEndpointMapper {

  @Override
  public @NotNull Firm map(@NotNull TestRequest request) {
    Country country = new Country();
    country.setName(request.getCountryName());
    country.setFirmSet(new HashSet<>());

    Firm firm = new Firm();
    firm.setName(request.getName());
    firm.setCountrySet(new HashSet<>());

    firm.getCountrySet().add(country);
    country.getFirmSet().add(firm);

    return firm;
  }

  @Override
  public @NotNull TestResponse map(@NotNull Long count) {
    TestResponse response = new TestResponse();
    response.setCount(count);
    return response;
  }
}
