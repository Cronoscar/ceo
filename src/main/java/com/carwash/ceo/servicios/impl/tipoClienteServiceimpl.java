package com.carwash.ceo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carwash.ceo.modelos.tipoCliente;
import com.carwash.ceo.repositorios.tipoClienteRepository;
import com.carwash.ceo.servicios.tipoClienteService;
@Service
public class tipoClienteServiceimpl implements tipoClienteService {
    @Autowired
    private tipoClienteRepository tipoClienteRepository;
    
   
    @Override
    public String CrearTipoCliente(String descripcion) {
   
    
     return "Tipo cliente guardado";
        
    }
    
}
;