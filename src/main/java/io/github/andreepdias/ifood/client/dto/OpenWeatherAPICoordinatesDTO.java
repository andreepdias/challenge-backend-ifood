package io.github.andreepdias.ifood.client.dto;

public class OpenWeatherAPICoordinatesDTO {

    private Double lon;
    private Double lat;

    public OpenWeatherAPICoordinatesDTO() {
    }

    public OpenWeatherAPICoordinatesDTO(Double lon, Double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public Double getLat() {
        return lat;
    }
}
