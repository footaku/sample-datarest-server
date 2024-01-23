package com.example.datarestserver;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BooksJpaRepository extends CrudRepository<Book, Long> {

    @Query("""
        SELECT
            books.id,
            books.name,
            books.type
        FROM
            rest.books
        WHERE
            books.name = :name
    """)
    List<Book> findByName(String name);
}
