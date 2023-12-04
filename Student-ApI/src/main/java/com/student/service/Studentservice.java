package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Repo.StudentRepo;
import com.student.modal.Student;

@Service
public class Studentservice {

	// DI
	@Autowired
	StudentRepo studentRepo;

	// insert single student data
	public Student insertStudentdata(Student s) {

		Student s1 = studentRepo.save(s);
		return s1;
	}

	// insert multiple student data
	public List<Student> insertstudentsData(List<Student> sm) {

		List<Student> sn = studentRepo.saveAll(sm);
		return sn;

	}

	// select the single student data
	public Student getstudentData(Integer sid) {

		return studentRepo.findById(sid).get();

	}

	// select Multiple student data
	public List<Student> getstudentsdata() {

		return studentRepo.findAll();
	}

	// update multiple student data
	public Student updatestudentdata(Integer sid, Student st) {
		Student sh = studentRepo.findById(sid).get();
//		sh.setSid(st.getSid());
		sh.setSname(st.getSname());
		sh.setSloc(st.getSloc());
		sh.setSemail(st.getSemail());
		return studentRepo.save(sh);
	}

	// Delete the student data
	public String detetethestudentdata(Integer sid) {
		studentRepo.deleteById(sid);
		return "";
	}

}
