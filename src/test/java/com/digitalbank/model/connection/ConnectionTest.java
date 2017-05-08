package com.digitalbank.model.connection;

import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fernando
 */
public class ConnectionTest {

    private DBConn conexao;
    private EntityManager entityManager;

    public ConnectionTest() {
    }

    @Test
    public void hasValidConnection() {
        Assert.assertNotNull(entityManager);
        Assert.assertTrue(entityManager.isOpen());
    }
}
