package it.epicode.pizzeria_JPA_persistence.repository;

import it.epicode.pizzeria_JPA_persistence.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    Pizza findByNome(String nome);
    long count();

    @Query("SELECT p FROM Pizza p WHERE p.prezzo > :prezzo")
    List<Pizza> findByPrezzoGreaterThan(double prezzo);

    @Query("SELECT COUNT(p) FROM Pizza p WHERE p.prezzo > :prezzo")
    Long countByPrezzoGreaterThan(double prezzo);
}
