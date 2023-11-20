package com.carwash.ceo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVehiculo")
    private int idvehiculo;
    @Column(name = "marca")
    private String marca;
    @Column(name = "anio")
    private int anio;
    @Column(name = "disponible")
    private boolean disponible;
}
