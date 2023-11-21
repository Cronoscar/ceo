package com.carwash.ceo.modelos;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cliente")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="codigoCliente")
private int idcliente;
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
