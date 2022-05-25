package pl.sda.finalproject.travelagency.module.menu;

public class MenuDto {

    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public MenuDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MenuDto setUrl(String url) {
        this.url = url;
        return this;
    }
}
