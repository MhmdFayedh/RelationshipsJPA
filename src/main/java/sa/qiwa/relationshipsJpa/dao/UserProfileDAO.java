package sa.qiwa.relationshipsJpa.dao;


import sa.qiwa.relationshipsJpa.entity.UserProfile;

public interface UserProfileDAO {
    /*  Save a user with a profile using Hibernate. */
    void save(UserProfile userProfile);
    /* Retrieve ser with a profile using Hibernate. */
    UserProfile findUserById(int id);


}
