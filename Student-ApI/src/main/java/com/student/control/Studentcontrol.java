package com.student.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.modal.Student;
import com.student.service.Studentservice;

@RestController
public class Studentcontrol {

	// API

	// DI
	@Autowired
	Studentservice studentservice;

	// inserting single student data
	@PostMapping("/insertsingleData")
	public Student insertdata(@RequestBody Student s2) {

		Student s3 = studentservice.insertStudentdata(s2);
		return studentservice.insertStudentdata(s2);

	}

	// inserting multiple student data
	@PostMapping("/insertmultipleData")
	public List<Student> insertmultipledata(@RequestBody List<Student> s4) {

		List<Student> s6 = studentservice.insertstudentsData(s4);
		return s6;

	}

	// getting the students All data
	@GetMapping("/getThestudentsData")
	public List<Student> gettheData() {
		return studentservice.getstudentsdata();

	}

	// getting the student single data
	@GetMapping("/getThestudentData/{sid}")
	public Student getData(@PathVariable Integer sid) {
		return studentservice.getstudentData(sid);

	}

	// update the student data
	@PutMapping("/updateTheStudentdata/{sid}")
	public Student updateThedata(@PathVariable Integer sid, @RequestBody Student s7) {

		return studentservice.updatestudentdata(sid, s7);
	}

	// delete the student data
	@DeleteMapping("/deleteStudentdata/{sid}")
	public String deleteTheStudentdata(@PathVariable Integer sid) {

		studentservice.detetethestudentdata(sid);

		return "Student data delete succesful";

	}

}
