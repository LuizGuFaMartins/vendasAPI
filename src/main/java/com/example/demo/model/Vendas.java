package com.example.demo.model;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
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

  // @ManyToOne
  // @JoinColumn(nullable = false)
  // private RendVendedor rendVen;

  // public void upTotal_vendas() {
  // ven.setTotal_vendas(ven.getTotal_vendas() + 1);
  // }
}
