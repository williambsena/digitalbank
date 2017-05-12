package com.digitalbank.model.connection;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fernando
 */
public class DBConn implements Serializable {

    private static final String PU = "digitalbankPU";
    private static DBConn instance;
    private final EntityManagerFactory factory;
    private EntityManager entityManager;

    private DBConn() {
        factory = Persistence.createEntityManagerFactory(PU);
    }

    public static synchronized DBConn newInstance() {
        if (instance == null) {
            instance = new DBConn();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

}
