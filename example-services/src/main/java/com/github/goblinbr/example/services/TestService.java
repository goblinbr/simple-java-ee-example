package com.github.goblinbr.example.services;

import com.github.goblinbr.example.domain.dao.AccessCountDao;
import com.github.goblinbr.example.domain.entities.AccessCount;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class TestService {

    @Inject
    private AccessCountDao accessCountDao;

    public AccessCount incrementAccessCount(String page) {
        AccessCount accessCount = accessCountDao.findByPage(page);
        if (accessCount == null) {
            accessCount = new AccessCount();
            accessCount.setPage(page);
            accessCount.setQty(1L);
            accessCountDao.create(accessCount);
        } else {
            accessCount.setQty(accessCount.getQty() + 1);
            accessCountDao.update(accessCount);
        }
        return accessCount;
    }

}
