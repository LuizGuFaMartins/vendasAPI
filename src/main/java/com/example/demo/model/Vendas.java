package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Vendas {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_venda;

  private String data_venda;
  private double valor;

  @ManyToOne
  @JoinColumn(nullable = false)
  private Vendedor ven;
}
