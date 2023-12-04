package com.Book.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Book.modal.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> 
{

}
