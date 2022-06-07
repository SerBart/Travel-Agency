CREATE TABLE IF NOT EXISTS TRIPS (
    ID BIGINT,
    PROM BOOLEAN,
    BEGINNING_DATE DATE,
    CITY_OF_ARRIVAL INTEGER,
    CITY_OF_DEPARTURE INTEGER,
    COUNTRY_OF_DEPARTURE INTEGER,
    END_DATE DATE,
    LONG_DESCRIPTION VARCHAR(255),
    SHORT_DESCRIPTION VARCHAR(255),
    STANDARD INTEGER,
    TRIP_COST INTEGER,
    UUID VARCHAR (255)

)