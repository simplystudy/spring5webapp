package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Book;

public interface BookRepsitory extends CrudRepository<Book, Long>{

}
