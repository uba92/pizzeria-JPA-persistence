package it.epicode.pizzeria_JPA_persistence.repository;

import it.epicode.pizzeria_JPA_persistence.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
