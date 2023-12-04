package com.Book.modal;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bId;
	private int bprice;
	private String bname;
	private String bcolour;
	
}
