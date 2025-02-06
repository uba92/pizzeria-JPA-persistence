package it.epicode.pizzeria_JPA_persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bevanda extends VoceMenu {

    private int quantity;

    @Override
    public String print(){

        return super.print() + " Quantità: " + quantity;

    }


}
