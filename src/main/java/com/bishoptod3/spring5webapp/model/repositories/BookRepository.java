package com.bishoptod3.spring5webapp.model.repositories;

import com.bishoptod3.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Loky on 29/07/2018.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
