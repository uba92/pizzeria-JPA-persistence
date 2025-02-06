package it.epicode.pizzeria_JPA_persistence.entities;

import it.epicode.pizzeria_JPA_persistence.interfaces.VoceMenu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "toppings")
public class Topping implements VoceMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double prezzo;
    private int calorie;
}
