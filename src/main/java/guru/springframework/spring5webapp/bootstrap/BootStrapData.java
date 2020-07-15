package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Address;
import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepsitory;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private AuthorRepository authorRepository;
	private BookRepsitory bookRepository;
	private PublisherRepository publisherRepository;
	
	public BootStrapData(AuthorRepository a, BookRepsitory b, PublisherRepository p) {
		this.authorRepository = a;
		this.bookRepository = b;
		this.publisherRepository = p;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Publisher p1 = new Publisher("SUN", "Manjari", "Pune", "MH", 423107);
		this.publisherRepository.save(p1);
		
		Author a1 = new Author("Amit","Dev");
		Book b1 = new Book("book1","1234");
		
		
		a1.getBooks().add(b1);
		b1.getAuthors().add(a1);
		b1.setPublisher(p1);
		p1.getBooks().add(b1);	
		
		
		this.authorRepository.save(a1);			
		this.bookRepository.save(b1);
		this.publisherRepository.save(p1);
			
		
		System.out.println("Number of Authors:- " + authorRepository.count());
		System.out.println("Number of Books:- " + bookRepository.count());
		System.out.println("Number of Publisher:- " + this.publisherRepository.count());		
		
		
	}

}
