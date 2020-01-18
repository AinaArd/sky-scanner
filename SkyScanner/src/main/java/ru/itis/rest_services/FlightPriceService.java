package ru.itis.rest_services;

import ru.itis.dto.FlightPricesDto;
import ru.itis.models.Subscription;

public interface FlightPriceService {

   /**
    * Finds minPrice based on {@link Subscription}.
    *
    * @param flightPricesDto provided {@link FlightPricesDto} object.
    * @return
    */
   Integer findMinPrice(FlightPricesDto flightPricesDto);

   /**
    * Finds all the flight data related to {@link Subscription} object.
    *
    * @param subscription provided {@link Subscription} object
    * @return {@link FlightPricesDto} with all the data related to flight specific in {@link Subscription}.
    */
   FlightPricesDto findFlightPrice(Subscription subscription);
}