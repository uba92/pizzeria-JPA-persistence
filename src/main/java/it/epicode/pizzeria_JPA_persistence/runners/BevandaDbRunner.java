package it.epicode.pizzeria_JPA_persistence.runners;

import it.epicode.pizzeria_JPA_persistence.entities.Bevanda;
import it.epicode.pizzeria_JPA_persistence.repository.BevandaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class BevandaDbRunner implements CommandLineRunner {

    @Autowired
    private BevandaRepository bevandaRepository;
    @Autowired
    private Bevanda cocaCola;
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Bean CocaCola: " + cocaCola);
        System.out.println("Salvando: " + cocaCola);
        bevandaRepository.save(cocaCola);
    }
}
