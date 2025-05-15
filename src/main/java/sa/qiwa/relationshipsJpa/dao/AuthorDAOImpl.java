package sa.qiwa.relationshipsJpa.dao;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sa.qiwa.relationshipsJpa.entity.Author;

@Repository
public class AuthorDAOImpl implements AuthorDAO {
    EntityManager entityManager;

    @Autowired
    public AuthorDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Author author) {
        entityManager.persist(author);
    }
}
