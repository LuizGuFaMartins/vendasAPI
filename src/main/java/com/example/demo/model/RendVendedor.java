package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
public class RendVendedor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long rendId;

  @OneToOne
  @JoinColumn(nullable = false)
  private Vendedor ven;

  private int total_vendas;

  private double mdiaria_vendas;

  public RendVendedor(Vendedor vendedor, int total, double media) {
    ven = vendedor;
    total_vendas = total;
    mdiaria_vendas = media;
  }

  public void setTotal_vendas() {
    this.total_vendas = total_vendas + 1;
  }

  public void setMdiaria_vendas(int cont) {
    float calc = total_vendas;
    if (calc == 0 && cont == 0) {
      this.mdiaria_vendas = 0;
    } else {
      this.mdiaria_vendas = calc / cont;
    }

  }

}
