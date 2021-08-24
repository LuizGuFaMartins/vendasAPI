package com.example.demo.repository;

import com.example.demo.model.Vendedor;

import org.springframework.data.repository.CrudRepository;

public interface VendedorRepository extends CrudRepository<Vendedor, Long> {
}

// import org.springframework.data.jpa.repository.JpaRepository;

// public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
// }
