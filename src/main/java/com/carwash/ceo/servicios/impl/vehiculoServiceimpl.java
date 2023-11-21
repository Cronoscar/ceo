package com.carwash.ceo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carwash.ceo.modelos.Vehiculo;
import com.carwash.ceo.repositorios.vehiculoRepository;
import com.carwash.ceo.servicios.vehiculoService;

@Service
public class vehiculoServiceimpl implements vehiculoService {

    @Autowired
    private vehiculoRepository eVehiculoRepository;
    @Override
    public String Crearvehiculo(Vehiculo nVehiculo) {
         this.eVehiculoRepository.save(nVehiculo);
        return "se guardo el vehiculo";
        }
    
}
