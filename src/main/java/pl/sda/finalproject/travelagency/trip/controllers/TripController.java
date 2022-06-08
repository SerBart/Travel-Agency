package pl.sda.finalproject.travelagency.trip.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.finalproject.travelagency.Entity.CityOfArrival;
import pl.sda.finalproject.travelagency.Entity.CityOfDeparture;
import pl.sda.finalproject.travelagency.Entity.Country;
import pl.sda.finalproject.travelagency.Entity.Standard;
//import pl.sda.finalproject.travelagency.hotel.service.HotelsService;
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

//    @Autowired
//    private HotelsService hotelsService;
    @GetMapping("/trip/main")
    public String redirectToMainSite(Model model){
        model.addAttribute("citiesOfDeparture", CityOfDeparture.values());
        model.addAttribute("citiesOfArrival", CityOfArrival.values());
        model.addAttribute("standards", Standard.values());
        model.addAttribute("cityOfDeparture", CityOfDeparture.values());
        model.addAttribute("tripsUpc", tripService.findUpcomingTrips());
        return "trip/index.html";
    }

        @GetMapping("/trip")
        public String redirect(Model model){
            return "redirect:/trip/page/1?sortField=tripCost&sortDir=asc";
        }

    @GetMapping("/trip/page/1?sortField=shortDescription&sortDir=desc")
    public String list(Model model) {
        model.addAttribute("trips", tripService.findAll());
        model.addAttribute("citiesOfDeparture", CityOfDeparture.values());
        model.addAttribute("citiesOfArrival", CityOfArrival.values());
        model.addAttribute("standards", Standard.values());
        model.addAttribute("cityOfDeparture", CityOfDeparture.values());
//        model.addAttribute("tripCost" )
        return findPaginated(1, "tripCost", "asc", model) ;
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
        return "trip/tripsOffer";
    }
//    @GetMapping("/trip/cityofarrival/{cityOfArrival}")
//    public String list(@PathVariable ("cityOfArrival") CityOfArrival cityOfArrival, Model model) {
//        model.addAttribute("tripsByArrival", tripService.findByCityOfArrival(cityOfArrival));
//        return "trip/tripsOffer.html";
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
    public String details(@PathVariable("uuid") String uuid,
//                          @PathVariable("cityOfArrival") CityOfArrival cityOfArrival,
                          Model model) {
        model.addAttribute("trip", tripService.getByUuid(uuid));
        model.addAttribute("country", Country.values());
        model.addAttribute("cityOfDeparture", CityOfDeparture.values());
        model.addAttribute("cityOfArrival", CityOfArrival.values());
        model.addAttribute("standard", Standard.values());
//        model.addAttribute("hotel", hotelsService.getAllByCity(cityOfArrival));

        return "trip/details.html";
    }


    @GetMapping("/trip/page/{pageNo}")
    public String findPaginated(@PathVariable (value = "pageNo") int pageNo
            , @RequestParam("sortField") String sortField
            , @RequestParam("sortDir") String sortDir
            , Model model){
        int pageSize = 5;
        Page<TripEntity> page = tripService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<TripEntity> listTrips = page.getContent();
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("tripsProm", tripService.getAllByPromIsTrue());
        model.addAttribute("trips", tripService.findPaginated(pageNo, pageSize, sortField, sortDir));
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
        model.addAttribute("citiesOfDeparture", CityOfDeparture.values());
        model.addAttribute("citiesOfArrival", CityOfArrival.values());
        model.addAttribute("standards", Standard.values());
        model.addAttribute("listTrips", listTrips);

        return "trip/tripsOffer";
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
