package io.github.andreepdias.ifood.client.dto;

public class OpenWeatherAPIWeatherDTO {

    private Integer id;
    private String main;
    private String description;
    private String icon;

    public OpenWeatherAPIWeatherDTO() {
    }

    public OpenWeatherAPIWeatherDTO(Integer id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }
}
