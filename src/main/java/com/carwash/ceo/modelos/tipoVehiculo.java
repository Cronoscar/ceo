package com.carwash.ceo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipovehiculo")
public class tipoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoVehículo")
    private int idtipovehiculo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precioXhora")
    private double precioxhora;
}
