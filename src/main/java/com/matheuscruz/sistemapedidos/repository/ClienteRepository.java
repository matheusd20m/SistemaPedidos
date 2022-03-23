package com.matheuscruz.sistemapedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuscruz.sistemapedidos.domain.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
