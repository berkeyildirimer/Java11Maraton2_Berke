package com.berke.repository;

import com.berke.repository.entity.ComputerSpec;
import com.berke.utility.HibernateUtility;
import com.berke.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerSpecRepository extends MyFactoryRepository<ComputerSpec,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public ComputerSpecRepository() {
        super(new ComputerSpec());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
