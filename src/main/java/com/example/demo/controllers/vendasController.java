package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.RendVendedor;
import com.example.demo.model.Vendas;
import com.example.demo.model.Vendedor;
import com.example.demo.repository.RendVendedorRepository;
import com.example.demo.repository.VendasRepository;
import com.example.demo.repository.VendedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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

  @Autowired
  private VendedorRepository vendedorRepository;

  @Autowired
  private RendVendedorRepository rendVendedorRepository;

  @GetMapping("/")
  public Iterable<Vendas> venda() {
    return vendasRepository.findAll();
  }

  @PostMapping("/")
  public List<Vendedor> venda(@RequestBody Vendas vendas) {
    Long id;
    id = vendas.getVen().getId_vendedor();
    List<RendVendedor> rendVendedor = this.rendVendedorRepository.findAll();

    for (int i = 0; i < rendVendedor.size(); i++) {
      if (rendVendedor.get(i).getVen().getId_vendedor() == id) {
        rendVendedor.get(i).setTotal_vendas();
        rendVendedorRepository.save(rendVendedor.get(i));
      }
    }

    this.vendasRepository.save(vendas);
    return vendedorRepository.findAll();
  }

}

// vend.setId_venda(1L);
// vend.setData_venda("22/08/2021");
// vend.setValor(25.5);
// vend.getVen().setId_vendedor(1L);
// vend.getVen().setNome_vendedor("Cleber");
// vend.getVen().setTotal_vendas(0);

// MIlagre
// @PostMapping("/")
// public List<Vendedor> venda(@RequestBody Vendas vendas) {
// Long id;
// id = vendas.getVen().getId_vendedor();
// Optional<Vendedor> vendedor = this.vendedorRepository.findById(id);

// if (vendedor.isPresent()) {
// vendedor.get().setTotal_vendas();
// vendedorRepository.save(vendedor.get());
// }

// this.vendasRepository.save(vendas);
// return vendedorRepository.findAll();
// }