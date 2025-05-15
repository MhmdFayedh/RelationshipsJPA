package sa.qiwa.relationshipsJpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sa.qiwa.relationshipsJpa.dao.AuthorDAO;
import sa.qiwa.relationshipsJpa.entity.Author;
import sa.qiwa.relationshipsJpa.entity.Book;

@SpringBootApplication
public class RelationshipsJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationshipsJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorDAO authorDAO) {

		return runner -> {
			saveAuthorAndBooks(authorDAO);
		};
	}

	private void saveAuthorAndBooks(AuthorDAO authorDAO) {
		/* Create Author and books objects */

		Author author = new Author("Mohammed",
				"AlShammari",
				"m.alshammari@tst.com");

		Book book1 = new Book("To Kill a Mockingbird by Harper Lee", "Desc............");
		Book book2 = new Book("1984 by George Orwell", "Desc...........");
		Book book3 = new Book("The Alchemist by Paulo Coelho", "Desc...........");

		/*  Link books to its author */
		author.add(book1);
		author.add(book2);
		author.add(book3);


		/* Save Author and books */
		System.out.println("Saving author and associated books");
		authorDAO.save(author);


	}
}
