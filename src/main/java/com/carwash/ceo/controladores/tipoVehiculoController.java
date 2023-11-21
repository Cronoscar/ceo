package com.carwash.ceo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.ceo.modelos.tipoVehiculo;
import com.carwash.ceo.servicios.impl.tipoVehiculoServiceimpl;

@RestController
@RequestMapping("api/tipovehiculo")
public class tipoVehiculoController {
 @Autowired
private tipoVehiculoServiceimpl tipoVehiculoServiceimpl;
@PostMapping("/agregar")
public String guardartipovehiculo(tipoVehiculo nTipoVehiculo){
    return this.tipoVehiculoServiceimpl.creartipovehiculo(nTipoVehiculo);
}    
}
