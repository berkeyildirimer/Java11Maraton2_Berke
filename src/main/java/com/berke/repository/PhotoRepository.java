package com.berke.repository;

import com.berke.repository.entity.Photo;
import com.berke.utility.HibernateUtility;
import com.berke.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class PhotoRepository extends MyFactoryRepository<Photo,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;


    public PhotoRepository() {
        super(new Photo());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
