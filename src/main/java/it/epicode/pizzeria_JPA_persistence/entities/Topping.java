package it.epicode.pizzeria_JPA_persistence.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="toppings")
public class Topping extends VoceMenu {

}
