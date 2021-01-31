package io.github.andreepdias.ifood.resource.dto;

public class CityDTO {

    private String name;
    private String weather;
    private TemperatureDTO temperature;
    private Double pressure;
    private Double humidity;

    public CityDTO() {
    }

    public CityDTO(String name, String weather, TemperatureDTO temperature, Double pressure, Double humidity) {
        this.name = name;
        this.weather = weather;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public String getName() {
        return name;
    }

    public String getWeather() {
        return weather;
    }

    public TemperatureDTO getTemperature() {
        return temperature;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getHumidity() {
        return humidity;
    }
}
