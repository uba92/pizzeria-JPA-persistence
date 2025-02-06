package it.epicode.pizzeria_JPA_persistence.runners;

import it.epicode.pizzeria_JPA_persistence.entities.Bevanda;
import it.epicode.pizzeria_JPA_persistence.repository.BevandaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BevandaDbRunner implements CommandLineRunner {

    private final BevandaRepository bevandaRepository;
    private final Bevanda cocaCola;
    @Override
    public void run(String... args) throws Exception {
        bevandaRepository.save(cocaCola);
    }
}
