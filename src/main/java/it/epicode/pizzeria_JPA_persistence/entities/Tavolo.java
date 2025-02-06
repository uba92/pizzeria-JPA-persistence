package it.epicode.pizzeria_JPA_persistence.entities;

import it.epicode.pizzeria_JPA_persistence.enums.StatoTavolo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tavoli")
public class Tavolo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroTavolo;
    private int maxCoperti;

    @Enumerated(EnumType.STRING)
    private StatoTavolo statoTavolo;

    @OneToMany(mappedBy = "tavolo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ordine> listaOrdini = new ArrayList<>();

}
