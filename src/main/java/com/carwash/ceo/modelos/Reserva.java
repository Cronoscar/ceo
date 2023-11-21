package com.carwash.ceo.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reserva")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
    @JoinColumn(name = "idCliente",referencedColumnName = "idCliente")
    private Cliente cliente; 
      @JoinColumn(name = "idVehiculo",referencedColumnName = "idVehiculo")
    private Vehiculo vehiculo;   

    
    

}
