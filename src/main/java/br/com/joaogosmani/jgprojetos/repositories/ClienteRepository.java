package br.com.joaogosmani.jgprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.jgprojetos.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
