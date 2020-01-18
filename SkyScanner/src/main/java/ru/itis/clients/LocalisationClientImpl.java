package ru.itis.clients;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.dto.CountryDto;
import ru.itis.dto.CurrencyDto;
import ru.itis.rest_services.UniRestService;

import java.io.IOException;
import java.util.List;

import static ru.itis.rest_services.UniRestServiceImpl.*;

/**
* {@inheritDoc}
*/
@Component
public class LocalisationClientImpl implements LocalisationClient {

   @Autowired
   private UniRestService uniRestService;

   @Autowired
   private ObjectMapper objectMapper;

   /**
    * {@inheritDoc}
    */
   @Override
   public List<CountryDto> retrieveCountries(String locale) throws IOException {
       HttpResponse<JsonNode> response = uniRestService.get(String.format(COUNTRIES_FORMAT, locale));

       if (response.getStatus() != HttpStatus.SC_OK) {
           return null;
       }

       String jsonList = response.getBody().getObject().get(COUNTRIES_KEY).toString();

       return objectMapper.readValue(jsonList, new TypeReference<List<CountryDto>>() {
       });
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public List<CurrencyDto> retrieveCurrencies() throws IOException, UnirestException {

       HttpResponse<JsonNode> response = uniRestService.get(CURRENCIES_FORMAT);
       if (response.getStatus() != HttpStatus.SC_OK) {
           return null;
       }

       String jsonList = response.getBody().getObject().get(CURRENCIES_KEY).toString();

       return objectMapper.readValue(jsonList, new TypeReference<List<CurrencyDto>>() {
       });
   }
}