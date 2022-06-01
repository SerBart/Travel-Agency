package pl.sda.finalproject.travelagency.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.finalproject.travelagency.Dto.TripDto;
import pl.sda.finalproject.travelagency.Form.TripForm;
import pl.sda.finalproject.travelagency.Service.TripService;

@Controller
public class TripWebController {
    @Autowired
    private TripService tripService;

    @GetMapping("/trip")
    public String list(Model model) {
        model.addAttribute("trips", tripService.findAll());
        return "templates/trip/index.html";
    }

    @GetMapping("/trip-form")
    public String form(Model model) {
        model.addAttribute("tripForm", new TripDto());
        return "static/trip/form.html";
    }

    @GetMapping("/trip/{uuid}/edit")
    public String tripEdit(@PathVariable("uuid") String uuid, Model model) {
        TripDto tripForm = tripService.getByUuid(uuid);
        return "static/trip/form.html";
    }

    @PostMapping("/trip")
    public String createOrUpdate(TripForm tripForm) {
        tripService.createOrUpdate(tripForm);
        return "redirect:/trip";
    }

    @GetMapping("/trip/{uuid}")
    public String details(@PathVariable("uuid") String uuid, Model model) {
        model.addAttribute("trip", tripService.getByUuid(uuid));
        return "templates/trip/details.html";

    }

    @GetMapping("/trip/{uuid}/delete")
    public String deleteByGet(@PathVariable("uuid") String uuid) {
        tripService.delete(uuid);
        return "redirect:/trip";

    }


}
