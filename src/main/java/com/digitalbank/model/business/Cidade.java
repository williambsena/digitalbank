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
}
