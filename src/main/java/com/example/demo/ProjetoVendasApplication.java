package com.example.demo;

import com.example.demo.model.RendVendedor;
import com.example.demo.model.Vendas;
import com.example.demo.model.Vendedor;
import com.example.demo.repository.RendVendedorRepository;
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

	@Autowired
	private RendVendedorRepository rendVendedorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoVendasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Vendedor vendedor = new Vendedor(null, "João");
		RendVendedor rendVendedor = new RendVendedor(vendedor, 1, 1);
		Vendas vendas = new Vendas(null, "07/03/2021", 89.90, vendedor);
		vendedorRepository.save(vendedor);
		rendVendedorRepository.save(rendVendedor);
		vendasRepository.save(vendas);

		vendedor = new Vendedor(null, "Jenifer");
		rendVendedor = new RendVendedor(vendedor, 1, 1);
		vendas = new Vendas(null, "09/08/2010", 999.99, vendedor);
		vendedorRepository.save(vendedor);
		rendVendedorRepository.save(rendVendedor);
		vendasRepository.save(vendas);

		// vendedor = new Vendedor(null, "Cleber");
		// rendVendedor = new RendVendedor(vendedor, 1, 1);
		// vendas = new Vendas(null, "09/08/2010", 119.99, vendedor);
		// vendedorRepository.save(vendedor);
		// rendVendedorRepository.save(rendVendedor);
		// vendasRepository.save(vendas);

		// vendedor = new Vendedor(null, "Gabriela");
		// rendVendedor = new RendVendedor(vendedor, 1, 1);
		// vendas = new Vendas(null, "07/03/2021", 35.50, vendedor);
		// vendedorRepository.save(vendedor);
		// rendVendedorRepository.save(rendVendedor);
		// vendasRepository.save(vendas);
	}

}
