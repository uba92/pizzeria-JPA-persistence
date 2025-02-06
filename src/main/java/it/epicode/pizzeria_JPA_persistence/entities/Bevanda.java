package it.epicode.pizzeria_JPA_persistence.entities;

import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="bevande")
public class Bevanda extends VoceMenu {

    private int quantity;

    @Override
    public String print(){

        return super.print() + " Quantità: " + quantity;

    }


}
