package com.example.demo.controllers;

import com.example.demo.model.Vendas;
import com.example.demo.repository.VendasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendas")
public class vendasController {

  @Autowired
  private VendasRepository vendasRepository;

  @GetMapping("/")
  public Iterable<Vendas> venda() {
    return vendasRepository.findAll();
  }

  // @PostMapping("/")
  // public Vendas venda(@RequestBody Vendas vendas) {
  // return this.vendasRepository.save(vendas);
  // }
}

// vend.setId_venda(1L);
// vend.setData_venda("22/08/2021");
// vend.setValor(25.5);
// vend.getVen().setId_vendedor(1L);
// vend.getVen().setNome_vendedor("Cleber");
// vend.getVen().setTotal_vendas(0);