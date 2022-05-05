package com.leonardo.apiestoque.system;


import com.leonardo.apiestoque.system.GenericEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@org.springframework.stereotype.Repository
@Transactional
public abstract class GenericRepository<T extends GenericEntity<?>, ID>  implements Repository<T, ID> {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void persist(T entity) {
        entityManager.persist(entity);
    }



}
