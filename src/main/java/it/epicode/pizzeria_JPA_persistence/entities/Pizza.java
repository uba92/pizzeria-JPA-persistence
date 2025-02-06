package it.epicode.pizzeria_JPA_persistence.entities;

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
public class Pizza extends VoceMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Topping> toppings = new ArrayList<>();

    public List<Topping> getTopping() {
        return toppings;
    }
}
