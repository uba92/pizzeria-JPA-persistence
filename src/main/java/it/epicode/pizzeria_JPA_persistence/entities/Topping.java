package it.epicode.pizzeria_JPA_persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="toppings")
public class Topping extends VoceMenu {

    @ManyToMany(mappedBy = "toppings")

    private List<Pizza> listaPizze = new ArrayList<>();
}
