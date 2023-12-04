package com.Book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Book.Repo.BookRepo;
import com.Book.modal.Book;

@Service
public class Bookservice
{
	// DI
	@Autowired
	BookRepo bookRepo;
	
	// CRUD operations.,
	// 1. insert data.,
	public Book insertBook(Book book)
	{
		return bookRepo.save(book);
	}
	
	// 2. select the data.,
	public Book getBook(Integer bId)
	{
		return bookRepo.findById(bId).get();
	}
	
	// 3. update the record.,
	public Book updateBook(Book book, Integer bId)
	{
		Book book1 = bookRepo.findById(bId).get();
			book1.setBId(book.getBId());
			book1.setBcolour(book.getBcolour());
			book1.setBname(book.getBname());
			book1.setBprice(book.getBprice());
			
			return bookRepo.save(book1);
	}
	
	// 4. deleting the data 
	
	public String Deletedata(Integer bId) {
		bookRepo.deleteById(bId);
		return "";
		
	}

}

