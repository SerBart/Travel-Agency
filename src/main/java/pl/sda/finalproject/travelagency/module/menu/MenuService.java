package pl.sda.finalproject.travelagency.module.menu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    public List<MenuDto> getMenu(){
        return List.of(
                new MenuDto().setName("Lista wycieczek").setUrl("/templates/trip"),
                new MenuDto().setName("Wycieczki last minute").setUrl("/lastmin"),
                new MenuDto().setName("Najchętniej wybierane!").setUrl("/toptrip"),
                new MenuDto().setName("Wyszukiwanie").setUrl("/search"),
                new MenuDto().setName("Ostatnio zakupione").setUrl("/lastbuy"),
                new MenuDto().setName("Kontakt").setUrl("/contact")
        );

    }

}
