package pl.sda.finalproject.travelagency.trip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.sda.finalproject.travelagency.Entity.City;
import pl.sda.finalproject.travelagency.trip.dto.TripDto;
import pl.sda.finalproject.travelagency.trip.dto.TripForm;
import pl.sda.finalproject.travelagency.trip.service.TripService;
import io.swagger.annotations.Api;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "Book API")
public class TripRestController {

    @Autowired
    TripService tripService;

//    @PostMapping("/")
//    public String trip(Model model){
//        model.addAttribute();
//        return "admin-register.html";
//    }

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
            value = "/api/trip/city/{cityOfDeparture}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public List<TripDto> getTripsByCityOfDeparture(@PathVariable City cityOfDeparture){
        return tripService.findByCityOfDeparture(cityOfDeparture);
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

