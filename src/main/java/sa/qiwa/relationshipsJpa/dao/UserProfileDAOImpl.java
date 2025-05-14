package sa.qiwa.relationshipsJpa.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sa.qiwa.relationshipsJpa.entity.UserProfile;

@Repository
public class UserProfileDAOImpl implements UserProfileDAO{

    private EntityManager entityManager;

    @Autowired
    public UserProfileDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(UserProfile userProfile) {
        entityManager.persist(userProfile);
    }

    @Override
    public UserProfile findUserById(int id) {
        return entityManager.find(UserProfile.class, id);
    }
}
