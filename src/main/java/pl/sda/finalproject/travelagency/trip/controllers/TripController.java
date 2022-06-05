package pl.sda.finalproject.travelagency.trip.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.Standard;
import pl.sda.finalproject.travelagency.trip.dto.TripDto;
import pl.sda.finalproject.travelagency.trip.dto.TripForm;
import pl.sda.finalproject.travelagency.trip.entity.TripEntity;
import pl.sda.finalproject.travelagency.trip.service.TripSearchCriteria;
import pl.sda.finalproject.travelagency.trip.service.TripService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Controller
public class TripController {
    @Autowired
    private TripService tripService;

    @GetMapping("/trip")
    public String list(Model model) {
        model.addAttribute("trips", tripService.findAll());
        model.addAttribute("citiesOfDeparture", CityOfDeparture.values());
        model.addAttribute("citiesOfArrival", CityOfArrival.values());
        model.addAttribute("standards", Standard.values());
        return "trip/index.html";
    }

    @PostMapping(value = "/trip/search")
    public String listFiltered(
            @ModelAttribute("cityOfDeparture") CityOfDeparture cityOfDeparture,
            @ModelAttribute("cityOfArrival") CityOfArrival cityOfArrival,
//            @ModelAttribute("beginingDate") Date beginingDate,
//            @ModelAttribute("endDate") Date endDate,
            @ModelAttribute("standard") Standard standard,
            @ModelAttribute("tripLength") String tripLength,
            Model model) {
        TripSearchCriteria tripSearchCriteria = TripSearchCriteria.builder()
//                .beginingDate(beginingDate)
//                .endDate(endDate)
                .standard(standard)
                .cityOfDeparture(cityOfDeparture)
                .cityOfArrival(cityOfArrival)
                .tripLength(Objects.equals(tripLength, "") ? 0 : Integer.parseInt(tripLength))
                .build();
        model.addAttribute("citiesOfArrival", CityOfArrival.values());
        model.addAttribute("citiesOfDeparture", CityOfDeparture.values());
        model.addAttribute("standards", Standard.values());
        List<TripEntity> trips = new ArrayList<>();
        model.addAttribute("trips", tripService.findAll(tripSearchCriteria));
        return "trip/index.html";
    }
//    @GetMapping("/trip/cityofarrival/{cityOfArrival}")
//    public String list(@PathVariable ("cityOfArrival") CityOfArrival cityOfArrival, Model model) {
//        model.addAttribute("tripsByArrival", tripService.findByCityOfArrival(cityOfArrival));
//        return "trip/index.html";
//    }

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
        model.addAttribute("country", Country.values());
        model.addAttribute("cityOfDeparture", CityOfDeparture.values());
        model.addAttribute("cityOfArrival", CityOfArrival.values());
        model.addAttribute("standard", Standard.values());
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
        model.addAttribute("country", Country.values());
        model.addAttribute("cityOfDeparture", CityOfDeparture.values());
        model.addAttribute("cityOfArrival", CityOfArrival.values());
        model.addAttribute("standard", Standard.values());
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
