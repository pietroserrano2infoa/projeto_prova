package br.com.senai.infoa.backend.projeto_prova.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "Candidato")
public class Candidato {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "nome")
    private String nome;

    @Column (name = "telefone")
    private String telefone;

    @Column (name = "status")
    private Boolean salario;

    @ManyToMany
    @JoinTable (
        name = "candidatoVaga",
        joinColumns = @JoinColumn(name = "candidatoId", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "vagaId", referencedColumnName = "id")
    )
    private List<Vaga> vagas;

    public Candidato() {
    }

    public Candidato(Integer id, String nome, String telefone, Boolean salario, List<Vaga> vagas) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
        this.vagas = vagas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getSalario() {
        return salario;
    }

    public void setSalario(Boolean salario) {
        this.salario = salario;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }
}
