package mxryan.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import mxryan.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Archspire")
                .beerStyle("Lager")
                .build();
    }

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Smitty")
                .beerStyle("Trappist Ale")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("update beer: " + beerDto);
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting beer");

    }
}
