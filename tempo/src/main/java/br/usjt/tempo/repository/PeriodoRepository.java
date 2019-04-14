package br.usjt.tempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.tempo.model.Periodo;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Long>{

}
