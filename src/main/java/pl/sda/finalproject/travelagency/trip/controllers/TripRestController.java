package pl.sda.finalproject.travelagency.trip.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.trip.dto.TripDto;
import pl.sda.finalproject.travelagency.trip.dto.TripForm;
import pl.sda.finalproject.travelagency.trip.repositories.TripRepository;
import pl.sda.finalproject.travelagency.trip.service.TripService;
import io.swagger.annotations.Api;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = "Trip API")
public class TripRestController {

    @Autowired
    TripService tripService;

    @GetMapping(value = "/api/trip")
    public List<TripDto> getTrips() {
        return tripService.findAll();
    }

    @GetMapping(
            value = "/api/trip/{uuid}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public TripDto getTrip(@PathVariable String uuid) {
        return tripService.getByUuid(uuid);
    }
    @GetMapping(
            value = "/api/trip/cityOfDeparture/{cityOfDeparture}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public List<TripDto> getTripsByCityOfDeparture(@PathVariable CityOfDeparture cityOfDeparture){
        return tripService.findByCityOfDeparture(cityOfDeparture);
    }
    @GetMapping(
            value = "/api/trip/cityOfArrival/{cityOfArrival}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public List<TripDto> getTripsByCityOfArrival(@PathVariable CityOfArrival cityOfArrival){
        return tripService.findByCityOfArrival(cityOfArrival);
    }
    @GetMapping(
            value = "/api/trip/country/{countryOfArrival}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public List<TripDto> getTripsByCountryOfArrival(@PathVariable Country countryOfArrival){
        return tripService.findByCountryOfArrival(countryOfArrival);
    }

    @PostMapping("/api/trip")
    public TripDto createTrip(@Valid @RequestBody TripForm tripForm) {
        return tripService.create(tripForm);
    }


    @PutMapping("api/trip/{uuid}")
    public TripDto updateTrip(@PathVariable String uuid, @RequestBody TripForm tripForm) {
        return tripService.update(uuid, tripForm);
    }

    @DeleteMapping(value = "/api/trip/{uuid}")
    public void deleteTrip(@PathVariable String uuid) {
        tripService.delete(uuid);
    }

}

