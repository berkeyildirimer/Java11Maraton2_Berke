package com.berke.repository;

import com.berke.repository.entity.Timeline;
import com.berke.utility.HibernateUtility;
import com.berke.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class TimelineRepository extends MyFactoryRepository<Timeline,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public TimelineRepository() {
        super(new Timeline());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();

    }
}
