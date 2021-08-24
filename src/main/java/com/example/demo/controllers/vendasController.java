package com.example.demo.controllers;

import com.example.demo.model.Vendas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class vendasController {

  @GetMapping("/")
  public Vendas venda() {
    Vendas vend = new Vendas();

    vend.setId_venda(1);
    vend.setData_venda("22/08/2021");
    vend.setValor(25.5);
    vend.setId_vendedor(2);
    vend.setNome_vendedor("Cleber");

    return vend;
  }
}
