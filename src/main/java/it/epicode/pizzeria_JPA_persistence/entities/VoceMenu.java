package it.epicode.pizzeria_JPA_persistence.entities;

import it.epicode.pizzeria_JPA_persistence.print.Printable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="vocimenu")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoceMenu implements Printable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private double prezzo;
    private int calorie;

    public String print() {
        return nome + " € " + prezzo + " calorie: " + calorie;
    }

}
