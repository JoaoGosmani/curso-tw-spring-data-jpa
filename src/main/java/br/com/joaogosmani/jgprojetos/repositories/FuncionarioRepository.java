package br.com.joaogosmani.jgprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.jgprojetos.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
