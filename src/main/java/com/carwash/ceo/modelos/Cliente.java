package com.carwash.ceo.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="idCliente")
private Date idcliente;
@Column(name="nombre")
private String nombre;
@Column(name="apellido")
private String apellido;
@Column(name="fechaingreso")
private Date fechaingreso;

@ManyToOne
@JoinColumn(name = "idTipoCliente",referencedColumnName = "idTipoCliente")
private tipoCliente tipoCliente;

}
