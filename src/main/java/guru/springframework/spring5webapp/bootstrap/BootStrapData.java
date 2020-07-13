package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepsitory;

@Component
public class BootStrapData implements CommandLineRunner{

	private AuthorRepository authorRepository;
	private BookRepsitory bookRepository;
	
	public BootStrapData(AuthorRepository a, BookRepsitory b) {
		this.authorRepository = a;
		this.bookRepository = b;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Author a1 = new Author("Amit","Dev");
		Book b1 = new Book("book1","1234");
		a1.getBooks().add(b1);
		b1.getAuthors().add(a1);
		
		authorRepository.save(a1);
		bookRepository.save(b1);
		
		System.out.println("Number of Authors:- " + authorRepository.count());
		System.out.println("Number of Books:- " + bookRepository.count());
		
	}

}
