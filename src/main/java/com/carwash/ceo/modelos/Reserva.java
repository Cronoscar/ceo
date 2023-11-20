package com.carwash.ceo.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReserva")
    private int idreserva;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "dias")
    private int dias;
    @Column(name = "total")
    private double total;
        

    
    

}
