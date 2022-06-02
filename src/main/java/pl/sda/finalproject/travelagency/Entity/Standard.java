package pl.sda.finalproject.travelagency.Entity;

public enum Standard {
    ECONOMIC ("Ekonomiczny"),
    MEDIUM ("Sredni"),
    HIGH ("Wysoki");

    private final String name;

    Standard(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
