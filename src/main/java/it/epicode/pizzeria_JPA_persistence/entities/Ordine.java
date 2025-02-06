package it.epicode.pizzeria_JPA_persistence.entities;

import it.epicode.pizzeria_JPA_persistence.enums.StatoOrdine;
import it.epicode.pizzeria_JPA_persistence.print.Printable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ordine implements Printable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numeroOrdine;
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime oraOrdine = LocalDateTime.now();
    private List<VoceMenu> listaElementiOrdine = new ArrayList<>();
    private double costoCoperto;

    public double calcolaTotaleOrdine() {
        double totCoperti = costoCoperto * numeroCoperti;
        double totaleElementi = listaElementiOrdine.stream().mapToDouble(VoceMenu::getPrezzo).sum();
        return totCoperti + totaleElementi;
    }

    @Override
    public String print() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormattata = oraOrdine.format(formatter);
        return "Numero ordine: " + numeroOrdine + "\ntavolo: " + tavolo.getNumeroTavolo() + "\nstato ordine: " + statoOrdine + "\nnumero coperti: " + numeroCoperti + "\nora ordine: " + dataFormattata + "\ncosto coperto: " + costoCoperto + " \n --------Tot: " + calcolaTotaleOrdine() + " € --------";
    }

}
