package com.digitalbank.model.business;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "paises")
public class Pais extends AbstractEntity {

    @Column(length = 255, nullable = false, unique = true)
    private String nome;

    @Column(length = 5, nullable = false, unique = true)
    private String sigla;

    @Column(length = 5, nullable = false, unique = true)
    private Integer ddi;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "pais")
    private List<Estado> estados;

    public Pais() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getDdi() {
        return ddi;
    }

    public void setDdi(Integer ddi) {
        this.ddi = ddi;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    @Override
    public String toString() {
        return "Pais{" + "nome=" + nome + ", sigla=" + sigla + ", ddi=" + ddi + '}';
    }

}
