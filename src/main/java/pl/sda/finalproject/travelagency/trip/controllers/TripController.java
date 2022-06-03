package pl.sda.finalproject.travelagency.trip.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.trip.dto.TripDto;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.Standard;
import pl.sda.finalproject.travelagency.trip.dto.TripForm;
import pl.sda.finalproject.travelagency.trip.service.TripService;

@Controller
public class TripController {
    @Autowired
    private TripService tripService;

    @GetMapping("/trip")
    public String list(Model model) {
        model.addAttribute("trips", tripService.findAll());
        return "trip/index.html";
    }
    @GetMapping("/trip/cityofDeparture/{cityOfDeparture}")
    public String list(@PathVariable ("cityOfDeparture") CityOfDeparture cityOfDeparture, Model model) {
        model.addAttribute("trips", tripService.findByCityOfDeparture(cityOfDeparture));
        return "trip/index.html";
    }
    @GetMapping("/trip/cityofArrival/{cityOfArrival}")
    public String list(@PathVariable ("cityOfArrival") CityOfArrival cityOfArrival, Model model) {
        model.addAttribute("trips", tripService.findByCityOfArrival(cityOfArrival));
        return "trip/index.html";
    }

    @GetMapping("/trip-form")
    public String form(Model model) {
        model.addAttribute("tripForm", new TripDto());
        model.addAttribute("country", Country.values());
        model.addAttribute("cityOfDeparture", CityOfDeparture.values());
        model.addAttribute("cityOfArrival", CityOfArrival.values());
        model.addAttribute("standard", Standard.values());
        return "trip/form.html";
    }

    @GetMapping("/trip/{uuid}/edit")
    public String tripEdit(@PathVariable("uuid") String uuid, Model model) {
        TripDto tripForm = tripService.getByUuid(uuid);
        model.addAttribute("tripForm", tripForm);
        return "trip/form.html";
    }

    @PostMapping("/trip")
    public String createOrUpdate(TripForm tripForm) {
        tripService.createOrUpdate(tripForm);
        return "redirect:/trip";
    }

    @GetMapping("/trip/{uuid}")
    public String details(@PathVariable("uuid") String uuid, Model model) {
        model.addAttribute("trip", tripService.getByUuid(uuid));
        return "trip/details.html";
    }

    @GetMapping("/trip/{uuid}/delete")
    public String deleteByGet(@PathVariable("uuid") String uuid) {
        tripService.delete(uuid);
        return "redirect:/trip";
    }
    @PostMapping("/trip/{uuid}/delete")
    public String deleteByPost(@PathVariable("uuid") String uuid) {
        tripService.delete(uuid);
        return "redirect:/trip";
    }


}
