package com.dh.meli.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dh.meli.entity.Cliente;
import com.dh.meli.entity.Endereco;
import com.dh.meli.entity.Pedido;
import com.dh.meli.entity.Situacao;
import com.dh.meli.repository.ClienteRepository;
import com.dh.meli.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@PostMapping
	public void cadastra(@RequestBody Long id) {
		Cliente cliente = clienteRepository.getById(id);
		Pedido pedido = new Pedido(LocalDate.now(),Situacao.ABERTO, cliente);
		pedidoRepository.save(pedido);
	}

	
	@GetMapping
	public void listagem(Long id, String data, String bairro) {
		
		if(bairro != null) {
			List<Pedido> findByClienteEnderecoBairro = pedidoRepository.findByClienteEnderecoBairro(bairro);
			findByClienteEnderecoBairro.forEach(p -> System.out.println(p.getCliente().getNome() + "    " + p.getDataPedido()));
			return;
		}
		
		if(id==null) {
			List<Pedido> todosPedidos = pedidoRepository.findAll();
			todosPedidos.forEach(p -> System.out.println(p.getCliente().getNome() + "    " + p.getDataPedido()));
		}else {
			LocalDate dataPedido = LocalDate.parse(data);
			if(dataPedido != null) {
				List<Pedido> findByClienteIdAndDataPedido = pedidoRepository.findByClienteIdAndDataPedido(id, dataPedido);
				findByClienteIdAndDataPedido.forEach(p -> System.out.println(p.getCliente().getNome() + "  " + p.getId()));
				
			}else {
				List<Pedido> todosPedidos = pedidoRepository.findByClienteId(id);
				todosPedidos.forEach(p -> System.out.println(p.getCliente().getNome() + "    " + p.getDataPedido()));
			}
		}
		
	}
}
