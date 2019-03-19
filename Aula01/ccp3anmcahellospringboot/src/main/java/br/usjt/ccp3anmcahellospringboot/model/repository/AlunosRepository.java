package br.usjt.ccp3anmcahellospringboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ccp3anmcahellospringboot.model.Alunos;

public interface AlunosRepository extends JpaRepository<Alunos, Long> {
	
}
