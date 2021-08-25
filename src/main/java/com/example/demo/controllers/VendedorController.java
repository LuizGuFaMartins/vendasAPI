package com.example.demo.controllers;

import com.example.demo.model.Vendedor;
import com.example.demo.repository.VendedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
  // public Vendedor vendendo() {
  // Vendedor vendedor = new Vendedor();
  // vendedor.setNome_vendedor("Cleiton");
  // return vendedor;
  // }

  @PostMapping("/")
  public Vendedor venda(@RequestBody Vendedor vendedor) {
    this.vendedorRepository.save(vendedor);
    return vendedor;
  }
}
