package it.epicode.pizzeria_JPA_persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="vocimenu")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoceMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private double prezzo;
    private int calorie;



    public String print() {
        return "Bevanda: " + nome + " € " + prezzo + " calorie: " + calorie;
    }

}
