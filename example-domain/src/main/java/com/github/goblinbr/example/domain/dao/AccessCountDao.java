package com.github.goblinbr.example.domain.dao;

import com.github.goblinbr.example.domain.entities.AccessCount;
import com.github.goblinbr.example.domain.entities.AccessCount_;

import javax.enterprise.context.Dependent;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Dependent
public class AccessCountDao extends AbstractDao {

    public AccessCount findByPage(String page) {
        CriteriaBuilder cb = getEm().getCriteriaBuilder();
        CriteriaQuery<AccessCount> query = cb.createQuery(AccessCount.class);
        Root<AccessCount> from = query.from(AccessCount.class);
        query.select(from).where(cb.equal(from.get(AccessCount_.page), page));
        TypedQuery<AccessCount> tq = getEm().createQuery(query);
        List<AccessCount> resultList = tq.getResultList();
        return (resultList.isEmpty()) ? null : resultList.get(0);
    }

    public void create(AccessCount accessCount) {
        getEm().persist(accessCount);
    }

    public void update(AccessCount accessCount) {
        getEm().merge(accessCount);
    }
}
