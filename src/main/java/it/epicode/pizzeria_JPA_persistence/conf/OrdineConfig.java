package it.epicode.pizzeria_JPA_persistence.conf;

import it.epicode.pizzeria_JPA_persistence.entities.Menu;
import it.epicode.pizzeria_JPA_persistence.entities.Ordine;
import it.epicode.pizzeria_JPA_persistence.entities.Tavolo;
import it.epicode.pizzeria_JPA_persistence.enums.StatoOrdine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OrdineConfig {
    @Autowired
    private Tavolo tavolo;

    @Autowired
    private Menu menu;

    @Bean
    public Ordine ordine() {
        Ordine o = new Ordine();
        o.setNumeroOrdine(1);
        o.setStatoOrdine(StatoOrdine.IN_CORSO);
        o.setTavolo(tavolo);
        o.setNumeroCoperti(2);
        o.setCostoCoperto(1.5);
        o.setListaElementiOrdine(List.of(menu.getVoceMenu().get(0), menu.getVoceMenu().get(1), menu.getVoceMenu().get(2)));
        return o;
    }

    @Bean
    public Ordine newOrdine() {
        Ordine o = new Ordine();

        o.setNumeroOrdine(2);
        o.setTavolo(tavolo);
        o.setStatoOrdine(StatoOrdine.SERVITO);
        o.setNumeroCoperti(3);
        o.setCostoCoperto(2);
        o.setListaElementiOrdine(List.of(menu.getVoceMenu().get(0), menu.getVoceMenu().get(2), menu.getVoceMenu().get(4)));
        return o;
    }
}
