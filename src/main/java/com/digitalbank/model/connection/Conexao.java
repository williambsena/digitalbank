package com.digitalbank.model.connection;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fernando
 */
public final class Conexao implements Serializable {

    private static final String PERSISTENCE_UNIT_NAME = "digitalbankPU";
    private static Conexao instance;
    private final EntityManagerFactory factory;
    private EntityManager entityManager;

    private Conexao() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public static synchronized Conexao newInstance() {
        if (instance == null) {
            instance = new Conexao();
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
