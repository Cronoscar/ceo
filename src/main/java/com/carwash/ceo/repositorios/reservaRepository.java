package com.carwash.ceo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carwash.ceo.modelos.Reserva;

public interface reservaRepository extends JpaRepository<Reserva,Integer> {
    
}
