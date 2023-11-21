package com.carwash.ceo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tipocliente")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class tipoCliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idTipoCliente") 
   private int idtipoclientes;
   @Column(name = "descripcion") 
   private String descripcion;
    
}
