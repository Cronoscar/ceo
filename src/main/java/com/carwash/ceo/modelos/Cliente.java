package com.carwash.ceo.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

}
