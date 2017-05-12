package com.digitalbank.model.connection;

import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fernando
 */
public class ConnectionTest {

    private final EntityManager entityManager;

    public ConnectionTest() {
        entityManager = DBConn.newInstance().getEntityManager();
    }

    @Test
    public void isEntityManagerNotNull() {
        Assert.assertNotNull(entityManager);
    }

    @Test
    public void isEntityManagerOpen() {
        Assert.assertTrue(entityManager.isOpen());
    }
}
