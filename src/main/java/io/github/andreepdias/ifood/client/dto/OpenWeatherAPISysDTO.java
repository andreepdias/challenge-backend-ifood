package io.github.andreepdias.ifood.client.dto;

public class OpenWeatherAPISysDTO {

    private Integer type;
    private Integer id;
    private String country;
    private Integer sunrise;
    private Integer sunset;

    public OpenWeatherAPISysDTO() {
    }

    public OpenWeatherAPISysDTO(Integer type, Integer id, String country, Integer sunrise, Integer sunset) {
        this.type = type;
        this.id = id;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public Integer getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }
}
