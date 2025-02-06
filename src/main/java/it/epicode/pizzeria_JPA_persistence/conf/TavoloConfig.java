package it.epicode.pizzeria_JPA_persistence.conf;

import it.epicode.pizzeria_JPA_persistence.entities.Tavolo;
import it.epicode.pizzeria_JPA_persistence.enums.StatoTavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TavoloConfig {

    @Bean
    public Tavolo tavolo() {
        Tavolo t = new Tavolo();
        t.setNumeroTavolo(1);
        t.setMaxCoperti(4);
        t.setStatoTavolo(StatoTavolo.LIBERO);
        return t;
    }
}
