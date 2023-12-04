package com.mahendra.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahendra.Entity.Mahendra;

@Repository
public interface MahendraRepository extends JpaRepository  <Mahendra, Integer> {

}
