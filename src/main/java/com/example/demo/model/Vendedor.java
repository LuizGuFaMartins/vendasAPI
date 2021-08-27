package com.example.demo.model;

import javax.persistence.Column;
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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_vendedor;

  @Column(length = 50, nullable = false)
  private String nome_vendedor;

  // private int total_vendas;

  // public void setTotal_vendas() {
  // this.total_vendas = total_vendas + 1;
  // }

}
