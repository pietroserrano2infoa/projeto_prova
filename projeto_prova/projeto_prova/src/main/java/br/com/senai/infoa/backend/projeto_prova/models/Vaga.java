package br.com.senai.infoa.backend.projeto_prova.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "Vaga")
public class Vaga {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "titulo")
    private String titulo;

    @Column (name = "descricao")
    private String descricao;

    @Column (name = "salario")
    private Integer salario;

    @Column (name = "status")
    private Boolean status;

    @ManyToOne 
    @JoinColumn (name = "vagaId")
    private Empresa empresa;

    @ManyToMany(mappedBy = "vagas")
    private List<Candidato> candidatos;

    public Vaga() {
    }

    public Vaga(Integer id, String titulo, String descricao, Integer salario, Boolean status, Vaga vaga,
            List<Candidato> candidatos, Empresa empresa) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.salario = salario;
        this.status = status;
        this.empresa = empresa;
        this.candidatos = candidatos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
}
