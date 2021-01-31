package io.github.andreepdias.ifood.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.github.andreepdias.ifood.client.dto.OpenWeatherAPICityDTO;
import io.github.andreepdias.ifood.client.restcall.OpenWeatherAPIRestCall;
import io.github.andreepdias.ifood.exception.APINotRespondingException;
import io.github.andreepdias.ifood.resource.dto.CityDTO;
import io.github.andreepdias.ifood.resource.dto.TemperatureDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    private final OpenWeatherAPIRestCall restCall;

    public WeatherService(RestTemplate restTemplate, OpenWeatherAPIRestCall restCall) {
        this.restTemplate = restTemplate;
        this.restCall = restCall;
    }

    @HystrixCommand(fallbackMethod = "failureGetAPICity")
    public CityDTO getAPICity(String city) {
        OpenWeatherAPICityDTO apiDTO = restCall.getCityDTO(city.toLowerCase());
        return fromAPIDTOtoDTO(apiDTO);
    }

    @HystrixCommand(fallbackMethod = "failureGetAPICity")
    public CityDTO fake(String city) {
        OpenWeatherAPICityDTO apiDTO = restCall.fake(city.toLowerCase());
        return fromAPIDTOtoDTO(apiDTO);
    }

    public CityDTO failureGetAPICity(String city) {
        throw new APINotRespondingException("We can't get current weather information from " + city + " because our third party API is currently offline. Please, try again later.");
    }


    private CityDTO fromAPIDTOtoDTO(OpenWeatherAPICityDTO apiDTO) {
        TemperatureDTO temperatureDTO = new TemperatureDTO(apiDTO.getMain().getTemp(), apiDTO.getMain().getFeels_like(), apiDTO.getMain().getTemp_min(), apiDTO.getMain().getTemp_max());
        String weather = apiDTO.getWeather().size() > 0 ? apiDTO.getWeather().get(0).getDescription() : "";
        return new CityDTO(apiDTO.getName(), weather, temperatureDTO, apiDTO.getMain().getPressure(), apiDTO.getMain().getHumidity());
    }
}
