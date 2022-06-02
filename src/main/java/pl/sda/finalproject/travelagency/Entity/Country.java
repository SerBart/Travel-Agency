package pl.sda.finalproject.travelagency.Entity;

public enum Country {
    POLAND ("Polska"),
    GERMANY ("Niemcy"),
    UKRAINE ("Ukraina"),
    ENGLAND ("Anglia");

    private final String name;

    Country(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
