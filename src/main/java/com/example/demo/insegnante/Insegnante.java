package com.example.demo.insegnante;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import java.time.LocalDate;

@Entity
@Getter

public class Insegnante {
    @idins
    @GeneratedValue
    private Long idins;
    private String nome;
    private String cognome;
    private LocalDate datanascita;
}
