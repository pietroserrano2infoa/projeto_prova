package br.com.senai.infoa.backend.projeto_prova.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

@Entity
@Table (name = "Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "email")
    private String email;

    @Column (name = "setor")
    private String setor;

    @Column (name = "status")
    private Boolean status;

    @OneToMany (mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Vaga> Vaga;

    public Empresa() {
    }

    public Empresa(Integer id, String nome, String email, String setor, Boolean status,
            List<br.com.senai.infoa.backend.projeto_prova.models.Vaga> vaga) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.setor = setor;
        this.status = status;
        Vaga = vaga;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Vaga> getVaga() {
        return Vaga;
    }

    public void setVaga(List<Vaga> vaga) {
        Vaga = vaga;
    }
}
