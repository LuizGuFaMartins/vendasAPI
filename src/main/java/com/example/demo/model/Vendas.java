package com.example.demo.model;

import javax.annotation.Generated;
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
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id_venda;

  private String data_venda;
  private double valor;

  // @ManyToOne
  // @JoinColumn(name = "id_vendedor")
  // private Vendedor ven;

  // public void setId_venda(int id_venda) {
  // this.id_venda = id_venda;
  // }

  // public void setData_venda(String data_venda) {
  // this.data_venda = data_venda;
  // }

  // public void setValor(double valor) {
  // this.valor = valor;
  // }

  // public void setId_vendedor(int id_vendedor) {
  // this.id_vendedor = id_vendedor;
  // }

  // public void setNome_vendedor(String nome_vendedor) {
  // this.nome_vendedor = nome_vendedor;
  // }

}
