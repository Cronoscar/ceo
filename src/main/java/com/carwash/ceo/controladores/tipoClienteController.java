package com.carwash.ceo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.ceo.servicios.impl.tipoClienteServiceimpl;

@RestController
@RequestMapping("api/tipocliente")
public class tipoClienteController {
    @Autowired 
    private tipoClienteServiceimpl tipoClienteServiceimpl;
    @PostMapping("/guardar/tipocliente")
    public String guardarTipocliente(@RequestParam String descripcion){

        return this.tipoClienteServiceimpl.CrearTipoCliente(descripcion);
    }
}
