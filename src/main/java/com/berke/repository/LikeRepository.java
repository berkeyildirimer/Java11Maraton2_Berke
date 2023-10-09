package com.berke.repository;

import com.berke.repository.entity.Like;
import com.berke.utility.HibernateUtility;
import com.berke.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class LikeRepository extends MyFactoryRepository<Like,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public LikeRepository() {
        super(new Like());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }

}
