package br.com.senai.infoa.backend.projeto_prova.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infoa.backend.projeto_prova.models.Candidato;
import br.com.senai.infoa.backend.projeto_prova.repostiroies.CandidatoRepository;

@Service 
public class CandidatoService {
    
    @Autowired 
    private CandidatoRepository candidatoRepository;

    public Long contar() {
        return candidatoRepository.count();
    }

    public List<Candidato> listar(){
        return candidatoRepository.findAll();
    }

    public Candidato buscarPorId(Integer id) {
        return candidatoRepository.findById(id).get();
    }
    
    public CandidatoService(CandidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }
}
