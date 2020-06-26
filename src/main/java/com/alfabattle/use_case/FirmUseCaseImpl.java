package com.alfabattle.use_case;

import com.alfabattle.api.TestRequest;
import com.alfabattle.api.TestResponse;
import com.alfabattle.mapper.FirmEndpointMapper;
import com.alfabattle.repository.FirmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * User: @AleksandrMIM
 * Date: 26.06.2020
 * Time: 12:19
 */
@Service
@RequiredArgsConstructor
public class FirmUseCaseImpl implements FirmUseCase {

  private final FirmRepository firmRepository;
  private final FirmEndpointMapper firmEndpointMapper;

  @Override
  public @NotNull TestResponse saveFirm(@NotNull TestRequest testRequest) {
    firmRepository.save(firmEndpointMapper.map(testRequest));
    return firmRepository.findByNameAndCountry(testRequest.getName(), testRequest.getCountryName())
        .map(firmEndpointMapper::map)
        .orElse(new TestResponse());
  }
}
