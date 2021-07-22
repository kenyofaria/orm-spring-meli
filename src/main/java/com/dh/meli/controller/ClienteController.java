package com.dh.meli.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dh.meli.entity.Cliente;
import com.dh.meli.entity.Endereco;
import com.dh.meli.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public void cadastra() {
		Endereco endereco = new Endereco("São Paulo", "1212", "wedede", "centro");
		Cliente cliente = new Cliente("WIncenty", 'm', LocalDate.of(1985, Month.JANUARY, 16), endereco);
		clienteRepository.save(cliente);
	}

	
	@GetMapping
	public void listagem(String data) {
		
		if(data!=null) {
			LocalDate dataPedido = LocalDate.parse(data);
			List<Cliente> caras = clienteRepository.consulta(dataPedido);
			caras.forEach(c -> System.out.println(c.getNome()));
			return;
		}
		
		System.out.println("----------------------------------------------------------------");
		List<Cliente> clientes = clienteRepository.findAll();
		clientes.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("\n\n --------------------------- centro -------------------------------------");
		List<Cliente> listaCentro = clienteRepository.findByEnderecoBairro("centro");
		listaCentro.forEach(c -> System.out.println(c.getNome()));
		
	}
}
