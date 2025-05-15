package sa.qiwa.relationshipsJpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sa.qiwa.relationshipsJpa.dao.RoleDAO;
import sa.qiwa.relationshipsJpa.dao.UserDAO;
import sa.qiwa.relationshipsJpa.entity.Role;
import sa.qiwa.relationshipsJpa.entity.User;

@SpringBootApplication
public class RelationshipsJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationshipsJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(RoleDAO roleDAO) {

		return runner -> {
			createRoleAndUsers(roleDAO);
		};
	}

	private void createRoleAndUsers(RoleDAO roleDAO) {
		System.out.println("Creating Role...");

		Role role = new Role("ADMIN");
		User user1 = new User("Mohammed",
				"AlShammari",
				"M.AlShammari");

		User user2 = new User("Basam",
				"AlShammari",
				"M.AlShammari");

		role.addUser(user1);
		role.addUser(user2);

		System.out.println("Saving User: " + role);
		System.out.println("Saving User's roles" + role.getUsers());

		roleDAO.save(role);


	}

}
