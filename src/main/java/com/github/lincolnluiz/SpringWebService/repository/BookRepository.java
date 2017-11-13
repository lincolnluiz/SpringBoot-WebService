package com.github.lincolnluiz.SpringWebService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.lincolnluiz.SpringWebService.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	public List<Book> findBookByTitleContaining(String title);
	
}
