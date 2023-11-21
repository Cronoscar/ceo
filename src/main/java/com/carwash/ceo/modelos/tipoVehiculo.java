package com.carwash.ceo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tipovehiculo")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class tipoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoVehiculo")
    private int idtipovehiculo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precioxhora")
    private Double precioxhora;
}
