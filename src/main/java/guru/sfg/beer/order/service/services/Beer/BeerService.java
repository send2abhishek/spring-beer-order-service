package guru.sfg.beer.order.service.services.Beer;

import guru.sfg.brewery.model.BeerDto;


import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);

    Optional<BeerDto> getBeerByUpc(String upc);
}
