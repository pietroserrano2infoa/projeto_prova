package br.com.senai.infoa.backend.projeto_prova.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infoa.backend.projeto_prova.models.Candidato;
import br.com.senai.infoa.backend.projeto_prova.services.CandidatoService;

@RestController 
@RequestMapping("/candidato")
public class CandidatoController {
    @Autowired 
    private CandidatoService candidatoService;

    @GetMapping("/contar")
    public Long contar() {
        return candidatoService.contar();
    }

    @GetMapping("/listar")
    public List<Candidato> listar() {
        return candidatoService.listar();
    }

    @GetMapping("/buscar/{id}")
    public Candidato buscarPorId(@PathVariable  Integer id) {
        return candidatoService.buscarPorId(id);
    }

    public CandidatoController(CandidatoService candidatoService) {
        this.candidatoService = candidatoService;
    }
}