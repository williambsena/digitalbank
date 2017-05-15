package com.digitalbank.model.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "cidades")
public class Cidade extends AbstractEntity {

    @Column(length = 255, nullable = false, unique = true)
    private String nome;

    @ManyToOne
    private Estado estado;

    public Cidade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", estado=" + estado + '}';
    }

}
