package com.github.goblinbr.example.domain.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDao {

    @PersistenceContext(name = "example-pu")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }
}
