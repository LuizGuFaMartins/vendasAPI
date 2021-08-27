package com.example.demo.controllers;

import com.example.demo.model.RendVendedor;
import com.example.demo.model.Vendedor;
import com.example.demo.repository.RendVendedorRepository;
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

  @Autowired
  private RendVendedorRepository rendVendedorRepository;

  @GetMapping("/")
  public Iterable<Vendedor> venda() {
    return vendedorRepository.findAll();
  }

  @PostMapping("/")
  public Vendedor venda(@RequestBody Vendedor vendedor) {
    this.vendedorRepository.save(vendedor);

    RendVendedor rendVendedor = new RendVendedor(vendedor, 0, 0);
    rendVendedorRepository.save(rendVendedor);

    return vendedor;
  }
}
