package com.dh.meli.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dh.meli.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	List<Pedido> findByClienteId(Long id);
	List<Pedido> findByClienteIdAndDataPedido(Long id, LocalDate data);
	List<Pedido> findByClienteEnderecoBairro(String bairro);
	//listar os clientes que tiveram mais de dois pedidos em um mesmo dia
	
	
	
	
	
//	where p.cliente_id = c.id
//	and p.data_pedido = '2021-07-22'
//	group by c.nome
//	having count(p.*) >= 2

}
