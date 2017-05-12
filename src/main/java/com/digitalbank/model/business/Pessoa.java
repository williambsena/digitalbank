package com.digitalbank.model.business;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "pessoas")
public class Pessoa extends AbstractEntity {

    @Column(length = 255, nullable = false)
    private String nome;

    @Column(length = 255, unique = true)
    private String email;

    @Temporal(TemporalType.DATE)
    private Date nascimento;

    @OneToOne
    private Usuario usuario;

    public Pessoa() {
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", nascimento=" + nascimento + ", usuario=" + usuario + '}';
    }

}
