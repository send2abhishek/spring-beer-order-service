package guru.sfg.beer.order.service.services;

import guru.sfg.beer.order.service.domain.BeerOrder;

// this will kick off the validation process
public interface BeerOrderManager {

    BeerOrder newBeerOrder(BeerOrder beerOrder);
}
