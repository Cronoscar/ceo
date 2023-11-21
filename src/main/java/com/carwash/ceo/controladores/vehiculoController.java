package com.carwash.ceo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.ceo.modelos.Vehiculo;
import com.carwash.ceo.servicios.impl.vehiculoServiceimpl;

@RestController
@RequestMapping("api/vehiculo")
public class vehiculoController {
    @Autowired
    private vehiculoServiceimpl vehiculoServiceimpl;
    @PostMapping("/agregar")
    public String agregarV(@RequestBody Vehiculo nVehiculo){
        return this.vehiculoServiceimpl.Crearvehiculo(nVehiculo);
    }
}
