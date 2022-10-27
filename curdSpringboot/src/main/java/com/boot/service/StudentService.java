package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Student;
import com.boot.model.StudentModel;
import com.boot.repository.StudentRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    //Get all the students
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    //display one student by id
    public Student getStudentById(int id) {
        return studentRepository.findById(id);
    }

    //save student in database
    public Student saveStudent(StudentModel student) {
        try{
        	Student std = new Student();
        	std.setEmail(student.getEmail());
        	std.setGrade(student.getGrade());
        	std.setName(student.getName());
            return studentRepository.save(std);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //delete stuednt by id
    public void deleteStudent(int id) {
        try{
            studentRepository.deleteById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

	public Student updateStudent(Student student) {

		Student std = studentRepository.findById(student.getId());
		if(std != null) {
        	std.setEmail(student.getEmail());
        	std.setGrade(student.getGrade());
        	std.setName(student.getName());
            return studentRepository.save(std);
		}
		return null;
	}

}

