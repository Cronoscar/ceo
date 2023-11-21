package com.carwash.ceo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carwash.ceo.modelos.Cliente;

public interface clienteRepository extends JpaRepository<Cliente,Integer> {

    
  
}
