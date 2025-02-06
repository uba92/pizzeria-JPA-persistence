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
@RequiredArgsConstructor
public class MenuConfig {
    private final Pizza margherita, diavola, prosciutto;
    private final Bevanda acqua, fanta, cocaCola;


    @Bean
    public Menu menu() {
        Menu m = new Menu();
        m.setNome("Menu del Giorno");
        m.setVoceMenu(List.of( margherita, diavola, prosciutto, acqua, fanta, cocaCola));
        return m;
    }
}
