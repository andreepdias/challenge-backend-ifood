package io.github.andreepdias.ifood.client.dto;

public class OpenWeatherAPIWindDTO {

    private Double speed;
    private Double deg;

    public OpenWeatherAPIWindDTO() {
    }

    public OpenWeatherAPIWindDTO(Double speed, Double deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public Double getSpeed() {
        return speed;
    }

    public Double getDeg() {
        return deg;
    }
}
