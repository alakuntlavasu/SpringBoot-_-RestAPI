package com.mahendra.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.Entity.Mahendra;
import com.mahendra.Repo.MahendraRepository;

@RestController
public class MahendraControler {

	// DI
	@Autowired
	MahendraRepository repo;

	@PostMapping("/mahendra/SingleCarPost")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Mahendra postsingleCar(@RequestBody Mahendra mahendra) {
		Mahendra mahendrasingle = repo.save(mahendra);
		return mahendrasingle;
	}

	@PostMapping("/mahendra/allcarspost")
	public List<Mahendra> postmahendracars(@RequestBody List<Mahendra> mahendra) {

		List<Mahendra> mahendracars = repo.saveAll(mahendra);
		return mahendracars;
	}

	@GetMapping("/mahendra/getAllCars")
	public List<Mahendra> getAllCars() {

		List<Mahendra> mahendracar = repo.findAll();
		return mahendracar;

	}

	@GetMapping("/getingmahendra/{id}")
	public Mahendra getmahendracar(@PathVariable int id) {

		Mahendra mahendrabyid = repo.findById(id).get();
		return mahendrabyid;

	}

	@PutMapping("/mahendracarsupdate/{id}")
	public Mahendra updatemahendracars(@PathVariable int id, @RequestBody Mahendra mahendra) {

		Mahendra mahendraupdate = repo.findById(id).get();
		mahendraupdate.setColor(mahendra.getColor());
		mahendraupdate.setModel(mahendra.getModel());
		mahendraupdate.setPrice(mahendra.getPrice());

		return repo.save(mahendraupdate);
	}

	@DeleteMapping("/mahendracarsdelected/{id}")
	public void MahendracarsDeleted(@PathVariable int id) {

		Mahendra mahendradelete = repo.findById(id).get();

		repo.delete(mahendradelete);
	}

}
