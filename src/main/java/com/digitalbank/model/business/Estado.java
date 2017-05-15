package com.digitalbank.model.business;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "estados")
public class Estado extends AbstractEntity {

    @Column(length = 255, nullable = false, unique = true)
    private String nome;

    @Column(length = 5, nullable = false, unique = true)
    private String uf;

    @ManyToOne
    private Pais pais;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "estado")
    private Set<Cidade> cidades;

    public Estado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Set<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(Set<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public String toString() {
        return "Estado{" + "nome=" + nome + ", uf=" + uf + ", pais=" + pais + '}';
    }

}
