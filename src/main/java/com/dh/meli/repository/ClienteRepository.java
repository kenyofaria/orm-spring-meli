package com.dh.meli.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dh.meli.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findByEnderecoBairro(String bairro);

	@Query(value = "select c from Pedido p, Cliente c where p.cliente.id = c.id and p.dataPedido = :data group by c having count(p.id) >=2")
	List<Cliente> consulta(@Param(value = "data") LocalDate data);
}
