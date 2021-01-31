package io.github.andreepdias.ifood.resource.dto;

public class TemperatureDTO {

    private Double temperature;
    private Double thermalSensation;
    private Double minimumTemperature;
    private Double maximumTemperature;

    public TemperatureDTO() {
    }

    public TemperatureDTO(Double temperature, Double thermalSensation, Double minimumTemperature, Double maximumTemperature) {
        this.temperature = temperature;
        this.thermalSensation = thermalSensation;
        this.minimumTemperature = minimumTemperature;
        this.maximumTemperature = maximumTemperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getThermalSensation() {
        return thermalSensation;
    }

    public Double getMinimumTemperature() {
        return minimumTemperature;
    }

    public Double getMaximumTemperature() {
        return maximumTemperature;
    }
}
