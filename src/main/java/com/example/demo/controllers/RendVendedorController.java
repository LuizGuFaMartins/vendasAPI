package com.example.demo.controllers;

import java.util.List;

import com.example.demo.model.RendVendedor;
import com.example.demo.repository.RendVendedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rendimento")
public class RendVendedorController {

  @Autowired
  private RendVendedorRepository rendVendedorRepository;

  @GetMapping("/")
  public Iterable<RendVendedor> venda() {
    return rendVendedorRepository.findAll();
  }

  @PostMapping("/")
  public RendVendedor venda(@RequestBody RendVendedor rendVendedor) {
    this.rendVendedorRepository.save(rendVendedor);
    return rendVendedor;
  }
}
