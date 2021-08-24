package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Vendedor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id_vendedor;

  private String nome_vendedor;
  private int total_vendas;
  private double mdiaria_vendas;

  // public float mdiaria_vendas(int d1, int d2) {

  // }

}
