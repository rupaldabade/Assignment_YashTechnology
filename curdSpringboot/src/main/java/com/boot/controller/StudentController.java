package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.boot.model.Student;
import com.boot.repository.StudentRepository;
import com.boot.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;
    
    @Autowired
    StudentService studentService;

    //check the api's working correctly api
    @RequestMapping(value="/ping", method=RequestMethod.GET)
    public String healthCheck() {
        return "This is working well";
    }


    @RequestMapping(value="/students", method=RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @RequestMapping(value="/student", method=RequestMethod.POST)
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @RequestMapping(value="/findstudent", method = RequestMethod.GET)
    public Student findStudent(@RequestParam("studentId") int studentId) {
        return studentRepository.findById(studentId);
    }

    @RequestMapping(value= "/updatestudent", method = RequestMethod.POST)
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @RequestMapping(value="/deletestudent", method = RequestMethod.GET)
    public int deleteStudent(@RequestParam("studentId") int studentId) {
        return studentRepository.deleteById(studentId);
    }
}
