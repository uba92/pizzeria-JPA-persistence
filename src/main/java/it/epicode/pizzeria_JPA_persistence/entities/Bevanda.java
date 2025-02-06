package it.epicode.pizzeria_JPA_persistence.entities;

import it.epicode.pizzeria_JPA_persistence.interfaces.VoceMenu;
import it.epicode.pizzeria_JPA_persistence.print.Printable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bevande")
public class Bevanda implements Printable, VoceMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double prezzo;
    private int calorie;
    private int quantity;

    @Override
    public String print() {
        return "Bevanda: " + nome + " € " + prezzo + " calorie: " + calorie + " quantità: " + quantity;
    }
}
