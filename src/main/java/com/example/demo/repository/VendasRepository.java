package com.example.demo.repository;

import com.example.demo.model.Vendas;

import org.springframework.data.repository.CrudRepository;

public interface VendasRepository extends CrudRepository<Vendas, Long> {
}

// import org.springframework.data.jpa.repository.JpaRepository;
// public interface VendasRepository extends JpaRepository<Vendas, Long> {
// }
