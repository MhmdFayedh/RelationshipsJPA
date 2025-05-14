package sa.qiwa.relationshipsJpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sa.qiwa.relationshipsJpa.dao.UserProfileDAO;
import sa.qiwa.relationshipsJpa.entity.User;
import sa.qiwa.relationshipsJpa.entity.UserProfile;

@SpringBootApplication
public class RelationshipsJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationshipsJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserProfileDAO userProfileDAO) {

		return runner -> {
//			createUserAndProfile(userProfileDAO);
//			findUserProfile(userProfileDAO);
		};
	}

	private void findUserProfile(UserProfileDAO userProfileDAO) {
		int id = 1;
		System.out.println("Finding User and User's profile with the id: " + id);

		UserProfile userProfile = userProfileDAO.findUserById(id);

		System.out.println("User: " + userProfile.getUser());
		System.out.println("User's profile: " + userProfile);
	}

	private void createUserAndProfile(UserProfileDAO userProfileDAO) {
		System.out.println("Creating New User");

		User user = new User("Mohammed",
				"AlShammari",
				"m.alshammari@tst.com");

		UserProfile userProfile = new UserProfile("http://iamgeRepo.relationships-jpa.com",
				"Hello my name's mohammed bin trad ");

		userProfile.setUser(user);

		System.out.println("Saving user: " + userProfile.getUser());
		System.out.println("User's profile: " + userProfile);

		userProfileDAO.save(userProfile);
	}

}
