package io.github.andreepdias.ifood.client.restcall;

import io.github.andreepdias.ifood.client.dto.OpenWeatherAPICityDTO;
import io.github.andreepdias.ifood.exception.APINotRespondingException;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OpenWeatherAPIRestCall {

    private final RestTemplate restTemplate;

    public OpenWeatherAPIRestCall(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final String URL = "https://api.openweathermap.org/data/2.5";
    private final String APIKey = "b35d296d8b33f9a54da8c3c3284cce4b";

    @Cacheable(value="cities", key="#name")
    public OpenWeatherAPICityDTO getCityDTO(String name){
        String weatherURL = URL + "/weather?q=" + name + "&appid=" + APIKey;
        ResponseEntity<OpenWeatherAPICityDTO> cityRequest = restTemplate.getForEntity(weatherURL, OpenWeatherAPICityDTO.class);
        return cityRequest.getBody();
    }

    public OpenWeatherAPICityDTO fake(String name){
        String fakeURL = "https://api.oooopenweathermap.org/";
        ResponseEntity<OpenWeatherAPICityDTO> cityRequest = restTemplate.getForEntity(fakeURL, OpenWeatherAPICityDTO.class);
        return cityRequest.getBody();
    }

}
