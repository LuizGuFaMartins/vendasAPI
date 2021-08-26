package com.example.demo.repository;

import com.example.demo.model.RendVendedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RendVendedorRepository extends JpaRepository<RendVendedor, Long> {

}

// import org.springframework.data.repository.CrudRepository;

// public interface RendVendedorRepository extends CrudRepository<RendVendedor,
// Long> {

// }