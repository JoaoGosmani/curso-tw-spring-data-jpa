package br.com.joaogosmani.jgprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.jgprojetos.models.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    
}
