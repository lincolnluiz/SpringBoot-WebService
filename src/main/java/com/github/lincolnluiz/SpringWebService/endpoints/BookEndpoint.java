package com.github.lincolnluiz.SpringWebService.endpoints;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.lincolnluiz.SpringWebService.entity.Book;
import com.github.lincolnluiz.SpringWebService.repository.BookRepository;

@Service
@WebService
public class BookEndpoint {
	
	@Autowired
	BookRepository bookRepository;
	
	@WebMethod(operationName = "listAll")
	public List<Book> listAll(@WebParam(name = "title") String title) {
		
		return bookRepository.findBookByTitleContaining(title);
	}

}
