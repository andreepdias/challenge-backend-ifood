package io.github.andreepdias.ifood.client.dto;

public class OpenWeatherAPICloudDTO {

    private Double all;

    public OpenWeatherAPICloudDTO() {
    }

    public OpenWeatherAPICloudDTO(Double all) {
        this.all = all;
    }

    public Double getAll() {
        return all;
    }
}
