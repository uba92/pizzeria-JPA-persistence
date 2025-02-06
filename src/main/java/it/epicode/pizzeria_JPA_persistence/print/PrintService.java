package it.epicode.pizzeria_JPA_persistence.print;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrintService {

    public void print(it.epicode.pizzeria_JPA_persistence.print.Printable printable) {
        log.info(printable.print());
    }
}
