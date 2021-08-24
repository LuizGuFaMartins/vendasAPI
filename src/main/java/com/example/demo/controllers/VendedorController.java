package com.example.demo.controllers;

import com.example.demo.model.Vendedor;
import com.example.demo.repository.VendedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

  @Autowired
  private VendedorRepository vendedorRepository;

  @GetMapping("/")
  public Iterable<Vendedor> venda() {
    return vendedorRepository.findAll();
  }

  // @PostMapping("/")
  // public Vendas venda(@RequestBody Vendas vendas) {
  // return this.vendasRepository.save(vendas);
  // }
}
