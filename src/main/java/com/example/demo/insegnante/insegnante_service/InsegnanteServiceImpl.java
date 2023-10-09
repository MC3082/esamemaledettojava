package com.example.demo.insegnante.insegnante_service;

import com.example.demo.insegnante.Insegnante;
import com.example.demo.insegnante.InsegnantiRepository;

public class InsegnanteServiceImpl implements InsegnanteService {
    private final InsegnantiRepository insegnantiRepository;
    this.insegnantiRepository= insegnantiRepository;
    
    @Override
    public Insegnante createInsegnante(Insegnante insegnante){
        return null;
    }
    @Override
    public updateInsegnante (Insegnante insegnante){
        return null;
    }

    @Override
    public void deleteInsegnante(Long idins){
    }

    @Override
     public List<Insegnante> getAllInsegnanti(){

    }




}
