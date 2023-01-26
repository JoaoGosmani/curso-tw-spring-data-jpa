package br.com.joaogosmani.jgprojetos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.jgprojetos.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @EntityGraph(attributePaths = {"endereco", "cargo"})
    List<Funcionario> findAll();

}
