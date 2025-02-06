package it.epicode.pizzeria_JPA_persistence.conf;

import it.epicode.pizzeria_JPA_persistence.entities.Bevanda;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfig {

    @Bean
    public Bevanda cocaCola() {
        Bevanda b = new Bevanda(330);
        b.setNome("Coca Cola");
        b.setPrezzo(2.5);
        b.setCalorie(200);
        return b;
    }

    @Bean
    public Bevanda fanta() {
        Bevanda b = new Bevanda(330);
        b.setNome("Fanta");
        b.setPrezzo(2.5);
        b.setCalorie(200);
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
