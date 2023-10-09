package com.berke.repository;

import com.berke.repository.entity.Computer;
import com.berke.utility.HibernateUtility;
import com.berke.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerRepository extends MyFactoryRepository<Computer,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public ComputerRepository() {
        super(new Computer());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
