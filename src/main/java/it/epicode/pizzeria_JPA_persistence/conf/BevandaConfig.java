package it.epicode.pizzeria_JPA_persistence.conf;

import it.epicode.pizzeria_JPA_persistence.entities.Bevanda;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class BevandaConfig {

    @Bean
    public Bevanda cocaCola() {
        Bevanda b = new Bevanda();
        b.setNome("Coca Cola");
        b.setPrezzo(3.5);
        b.setCalorie(200);
        b.setQuantity(330);
        log.info("Coca Cola: Nome = {}, Prezzo = {}, Calorie = {}, Quantity = {}",
                b.getNome(), b.getPrezzo(), b.getCalorie(), b.getQuantity());

        return b;
    }

    @Bean
    public Bevanda fanta() {
        Bevanda b = new Bevanda();
        b.setNome("Fanta");
        b.setPrezzo(2.5);
        b.setCalorie(200);
        b.setQuantity(330);
        return b;
    }

    @Bean
    public Bevanda acqua() {
        Bevanda b = new Bevanda();
        b.setNome("Acqua");
        b.setPrezzo(1.0);
        b.setCalorie(20);
        b.setQuantity(500);
        return b;
    }
}
