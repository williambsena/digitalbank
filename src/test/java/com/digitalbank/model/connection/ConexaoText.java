package com.digitalbank.model.connection;

import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fernando
 */
public class ConexaoText {
    
    private final Conexao conexao;
    
    public ConexaoText() {
        conexao = Conexao.newInstance();
    }
    
     @Test
     public void hasValidConnection() {
         EntityManager entityManager = conexao.getEntityManager();
         Assert.assertNotNull(entityManager);
         Assert.assertTrue(entityManager.isOpen());
     }
}
