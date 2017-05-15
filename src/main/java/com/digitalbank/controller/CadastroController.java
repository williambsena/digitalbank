package com.digitalbank.controller;

import com.digitalbank.model.business.Pessoa;
import com.digitalbank.model.business.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author fernando
 */
@ManagedBean
@SessionScoped
public class CadastroController implements Serializable {

    private Pessoa pessoa;
    private Usuario usuario;

    @PostConstruct
    public void init() {
        pessoa = new Pessoa();
        usuario = new Usuario();
    }
    
    public String salvar() {
        pessoa.setUsuario(usuario);
        System.out.println(pessoa);
        return "/index.xhtml?faces-redirect=true";
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
