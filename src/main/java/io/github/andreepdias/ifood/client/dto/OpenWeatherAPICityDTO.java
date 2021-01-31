package io.github.andreepdias.ifood.client.dto;

import java.util.List;

public class OpenWeatherAPICityDTO {

    private OpenWeatherAPICoordinatesDTO coord;
    private List<OpenWeatherAPIWeatherDTO> weather;
    private String base;
    private OpenWeatherAPITemperatureDTO main;
    private Integer visibility;
    private OpenWeatherAPIWindDTO wind;
    private OpenWeatherAPICloudDTO clouds;
    private Integer dt;
    private OpenWeatherAPISysDTO sys;
    private Integer timezone;
    private Integer id;
    private String name;
    private Integer  cod;

    public OpenWeatherAPICityDTO() {
    }

    public OpenWeatherAPICityDTO(OpenWeatherAPICoordinatesDTO coord, List<OpenWeatherAPIWeatherDTO> weather, String base, OpenWeatherAPITemperatureDTO main, Integer visibility, OpenWeatherAPIWindDTO wind, OpenWeatherAPICloudDTO clouds, Integer dt, OpenWeatherAPISysDTO sys, Integer timezone, Integer id, String name, Integer cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public OpenWeatherAPICoordinatesDTO getCoord() {
        return coord;
    }

    public List<OpenWeatherAPIWeatherDTO> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public OpenWeatherAPITemperatureDTO getMain() {
        return main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public OpenWeatherAPIWindDTO getWind() {
        return wind;
    }

    public OpenWeatherAPICloudDTO getClouds() {
        return clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public OpenWeatherAPISysDTO getSys() {
        return sys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCod() {
        return cod;
    }
}
