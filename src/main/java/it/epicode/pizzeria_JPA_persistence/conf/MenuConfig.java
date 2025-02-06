package it.epicode.pizzeria_JPA_persistence.conf;

import it.epicode.pizzeria_JPA_persistence.entities.Bevanda;
import it.epicode.pizzeria_JPA_persistence.entities.Menu;
import it.epicode.pizzeria_JPA_persistence.entities.Pizza;
import it.epicode.pizzeria_JPA_persistence.entities.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration

public class MenuConfig {



    @Bean
    public Menu menu() {
        Pizza p = new Pizza();
        p.setNome("Margherita");
        p.setPrezzo(5);
        p.setCalorie(500);

        Bevanda b = new Bevanda();
        b.setNome("Coca Cola");
        b.setPrezzo(2.5);
        b.setCalorie(200);
        b.setQuantity(330);

        Menu m = new Menu();
        m.setNome("Menu del Giorno");
        m.setVoceMenu(List.of(p, b));
        return m;
    }
}
