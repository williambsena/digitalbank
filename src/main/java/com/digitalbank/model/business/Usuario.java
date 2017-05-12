package com.digitalbank.model.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "usuarios")
public class Usuario extends AbstractEntity {

    @Column(length = 255, unique = true, nullable = false)
    private String login;

    @Column(length = 255, nullable = false)
    private String senha;

    public Usuario() {
    }

    public Usuario(String username, String password) {
        this.login = username;
        this.senha = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", senha=" + senha + '}';
    }

}
