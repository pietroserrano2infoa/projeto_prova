package br.com.senai.infoa.backend.projeto_prova.repostiroies;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_prova.models.Vaga;

public interface VagaRepository extends JpaRepository<Vaga, Integer>{
    
}
