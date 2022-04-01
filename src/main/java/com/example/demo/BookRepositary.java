package com.example.demo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public interface BookRepositary extends CrudRepository<Book, Long> {
	Optional<Book> findById(Long id);
	Optional<Book> findByName(String str);
	
//	List<Book> getBookList();
}
