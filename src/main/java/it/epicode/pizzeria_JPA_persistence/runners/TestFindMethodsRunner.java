package it.epicode.pizzeria_JPA_persistence.runners;

import it.epicode.pizzeria_JPA_persistence.entities.Pizza;
import it.epicode.pizzeria_JPA_persistence.repository.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class TestFindMethodsRunner implements CommandLineRunner {
    @Autowired
    private PizzaRepository pizzaRepository;
    @Override
    public void run(String... args) throws Exception {
            Pizza pizzaMargherita = pizzaRepository.findByNome("Margherita");

            log.info("\n ------" +pizzaMargherita.print() + "-----\n");

            List<Pizza> prezzoMaggioredi5 = pizzaRepository.findByPrezzoGreaterThan(5.0);

            for (int i = 0; i < prezzoMaggioredi5.size(); i++) {
                log.info(prezzoMaggioredi5.get(i).print());
            }

            Long countPizze = pizzaRepository.countByPrezzoGreaterThan(5.0);
            log.info("Numero di pizze con prezzo maggiore di 5: " + countPizze);

    }
}
