package com.example.demo.insegnante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsegnantiRepository extends JpaRepository<Insegnanti, Long> {

}
