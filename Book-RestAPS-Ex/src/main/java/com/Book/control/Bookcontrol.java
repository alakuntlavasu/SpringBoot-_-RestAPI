package com.Book.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Book.modal.Book;
import com.Book.service.Bookservice;

@RestController
public class Bookcontrol {
	
	//DI
	@Autowired
	Bookservice bookservice;
	
	// API creation
	
	// insert book record
	@PostMapping("/insertData") // (post) http method
	public Book insertingdata(@RequestBody Book book) {
		Book bm=bookservice.insertBook(book);
		return bm;
		
	}
	
	//get the single Book data
	@GetMapping("/getthedata/{bId}")
	public Book selectdata(@PathVariable Integer bId) {
		return bookservice.getBook(bId);
		
	}
	
	//update the single book data
	@PutMapping("/updatebookdata/{bId}")
   public Book updatethedata(@PathVariable Integer bId, @RequestBody Book bh) {
	   
	return bookservice.updateBook(bh, bId);
	   
   }
	
	
	// deleting the Book  data
	@DeleteMapping("/deletingBookdata/{bId}")
	public String deletethedata(@PathVariable Integer bId) {
		
		 bookservice.Deletedata(bId);
		 return "deleting book gata";
		
	}
	
	
	
}
