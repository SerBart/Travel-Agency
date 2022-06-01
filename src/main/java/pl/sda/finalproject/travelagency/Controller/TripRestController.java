package pl.sda.finalproject.travelagency.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.sda.finalproject.travelagency.Dto.TripDto;
import pl.sda.finalproject.travelagency.Form.TripForm;
import pl.sda.finalproject.travelagency.Repositories.TripRepository;
import pl.sda.finalproject.travelagency.Service.TripService;
import io.swagger.annotations.Api;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "Book API")
public class TripRestController {

    @Autowired
    TripService tripService;

    @Autowired
    TripRepository tripRepository;


//    @PostMapping("/")
//    public String trip(Model model){
//        model.addAttribute();
//        return "admin-register.html";
//    }

    @GetMapping("/api/trip")
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

    @PostMapping("/api/trip")
    public String createTrip(@Valid @RequestBody TripForm tripForm) {
        tripService.create(tripForm);
        return "redirect:/api/trip";
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

