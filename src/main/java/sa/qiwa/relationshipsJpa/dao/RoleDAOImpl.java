package sa.qiwa.relationshipsJpa.dao;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sa.qiwa.relationshipsJpa.entity.Role;
@Repository
public class RoleDAOImpl implements RoleDAO{
    private EntityManager entityManager;
    public RoleDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Role role) {
        entityManager.persist(role);
    }
}
