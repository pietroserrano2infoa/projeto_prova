package br.com.senai.infoa.backend.projeto_prova.repostiroies;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_prova.models.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Integer>{
    
}
