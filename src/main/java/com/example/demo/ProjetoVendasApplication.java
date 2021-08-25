package com.example.demo;

import com.example.demo.model.Vendas;
import com.example.demo.model.Vendedor;
import com.example.demo.repository.VendasRepository;
import com.example.demo.repository.VendedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoVendasApplication implements CommandLineRunner {

	@Autowired
	private VendedorRepository vendedorRepository;

	@Autowired
	private VendasRepository vendasRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoVendasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Vendedor vendedor = new Vendedor(null, "Gabriel", 0);
		Vendas vendas = new Vendas(null, "07/03/2021", 89.90, vendedor);

		vendedorRepository.save(vendedor);
		vendasRepository.save(vendas);
	}

}
