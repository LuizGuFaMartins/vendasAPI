package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vendas {

  private int id_venda;
  private String data_venda;
  private double valor;
  private int id_vendedor;
  private String nome_vendedor;

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
