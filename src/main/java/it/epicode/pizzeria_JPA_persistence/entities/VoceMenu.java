package it.epicode.pizzeria_JPA_persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
@Entity
@Table(name="vocimenu")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class VoceMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Getter
    private double prezzo;
    private int calorie;

    public String print() {
        return "Bevanda: " + nome + " € " + prezzo + " calorie: " + calorie;
    }

    public void setNome(String margherita) {
    }

    public void setPrezzo(double v) {
    }

    public void setCalorie(int i) {
    }

}
