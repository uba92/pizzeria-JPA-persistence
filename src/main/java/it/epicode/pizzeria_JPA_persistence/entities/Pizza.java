package it.epicode.pizzeria_JPA_persistence.entities;

import it.epicode.pizzeria_JPA_persistence.interfaces.VoceMenu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pizze")
public class Pizza implements VoceMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double prezzo;
    private int calorie;
    private List<Topping> toppings = new ArrayList<>();

    public List<Topping> getTopping() {
        return toppings;
    }
}
