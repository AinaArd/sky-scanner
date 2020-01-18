package ru.itis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class FlightPricesDto {

    @JsonProperty("Quotes")
    private List<QuoteDto> quotas;

    @JsonProperty("Places")
    private List<PlacesDto> places;

    @JsonProperty("Carrier")
    private List<CarrierDto> carriers;

    @JsonProperty("Currencies")
    private List<CurrencyDto> currencies;
}