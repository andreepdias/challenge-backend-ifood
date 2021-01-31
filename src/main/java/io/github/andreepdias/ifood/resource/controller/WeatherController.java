package io.github.andreepdias.ifood.resource.controller;

import io.github.andreepdias.ifood.exception.APINotRespondingException;
import io.github.andreepdias.ifood.resource.dto.CityDTO;
import io.github.andreepdias.ifood.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("weather")
public class WeatherController {

    private final WeatherService service;

    public WeatherController(WeatherService service) {
        this.service = service;
    }

    @GetMapping(params = "city")
    public CityDTO getByName(@RequestParam String city){
        try{
            return service.getAPICity(city);
        }catch (APINotRespondingException ex){
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, ex.getMessage());
        }
    }

    @GetMapping(value = "fake", params = "city")
    public CityDTO fakeByName(@RequestParam String city){
        try{
            return service.fake(city);
        }catch (APINotRespondingException ex){
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, ex.getMessage());
        }
    }

}
