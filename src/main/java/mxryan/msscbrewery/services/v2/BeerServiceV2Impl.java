package mxryan.msscbrewery.services.v2;

import lombok.extern.slf4j.Slf4j;
import mxryan.msscbrewery.web.model.v2.BeerDtoV2;
import mxryan.msscbrewery.web.model.v2.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Archspire")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 createBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Dalancia")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        log.debug("update beer: " + beerDto);
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("delete beer: " + beerId);
    }
}
