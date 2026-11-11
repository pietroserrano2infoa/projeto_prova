package br.com.senai.infoa.backend.projeto_prova.repostiroies;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_prova.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{
    
}
