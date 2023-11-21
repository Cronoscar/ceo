package com.carwash.ceo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.carwash.ceo.modelos.tipoVehiculo;
import com.carwash.ceo.repositorios.tipoVehiculoRepository;
import com.carwash.ceo.servicios.tipoVehiculoService;

public class tipoVehiculoServiceimpl implements tipoVehiculoService {
    @Autowired
    private tipoVehiculoRepository tipoVehiculoRepository;
    @Override
    public String creartipovehiculo(tipoVehiculo nTipoVehiculo) {
    
    this.tipoVehiculoRepository.save(nTipoVehiculo);
    return "tipovehicuelo agregado";
    
}
}