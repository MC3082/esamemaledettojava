package com.example.demo.insegnante.insegnante_service;
import com.example.demo.insegnante.Insegnante;

import java.util.List;
public interface InsegnanteService {
    Insegnante createInsegnante(Insegnante insegnante);

    Insegnante updateInsegnante(Insegnante insegnante);

    void deleteInsegnante(Long idins);

    List<Insegnante> getAllInsegnanti();

    Insegnante getInsegnante(Long id);


}
