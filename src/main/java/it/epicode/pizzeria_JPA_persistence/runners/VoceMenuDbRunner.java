package it.epicode.pizzeria_JPA_persistence.runners;

import it.epicode.pizzeria_JPA_persistence.entities.*;
import it.epicode.pizzeria_JPA_persistence.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component

public class VoceMenuDbRunner implements CommandLineRunner {

    @Autowired
    private BevandaRepository bevandaRepository;
    @Autowired
    private Bevanda cocaCola, fanta, acqua;
    @Autowired
    private Pizza margherita, diavola, prosciutto;
    @Autowired
    private Topping pomodoro;
    @Autowired
    private Ordine ordine;
    @Autowired
    private Ordine newOrdine;
    @Autowired
    private Menu menu;
    @Autowired
    private MenuRepository menuRepository;
    @Autowired
    private Tavolo tavolo;
    @Autowired
    private OrdineRepository ordineRepository;
    @Autowired
    private PizzaRepository pizzaRepository;
    @Autowired
    private TavoloRepository tavoloRepository;
    @Autowired
    private ToppingRepository toppingRepository;


    @Override
    public void run(String... args) throws Exception {
      bevandaRepository.save(cocaCola);
      toppingRepository.save(pomodoro);
      pizzaRepository.save(margherita);
      bevandaRepository.save(fanta);
      bevandaRepository.save(acqua);
      pizzaRepository.save(diavola);
      pizzaRepository.save(prosciutto);

    }
}
