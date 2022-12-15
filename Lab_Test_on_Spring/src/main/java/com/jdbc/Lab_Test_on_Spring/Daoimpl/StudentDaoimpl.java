package com.jdbc.Lab_Test_on_Spring.Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.jdbc.Lab_Test_on_Spring.Dao.StudentDao;
import com.jdbc.Lab_Test_on_Spring.Entities.Student;

public class StudentDaoimpl implements StudentDao{
	
	private HibernateTemplate ht;

	// To insert record of Student
	@Transactional
	public int insertStudent(Student std) {
		
		@SuppressWarnings("unused")
		int id =(Integer) ht.save(std);
		return 1;

	}

	// To update record of Student
	@Transactional
	public int updateStudent(Student std) {
		ht.update(std);
		return 1;

	}

	// To delete record of Student
	@Transactional
	public int deleteStudent(Student std) {
		ht.delete(std);
		return 1;

	}

	// To get specific record
	public Student getStudent(int id) {

		Student std = ht.get(Student.class, id);
		return std;

	}

	// To get all records
	public List<Student> getAllStudents() {

		List<Student> stdList = ht.loadAll(Student.class);
		return stdList;

	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
