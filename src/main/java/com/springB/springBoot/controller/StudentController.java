package com.springB.springBoot.controller;

import com.springB.springBoot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //    http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent() {
        Student student = new Student(
                1, "홍", "길동"
        );
        return  student;
    }

    //    http://localhost:8080/students
    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "홍", "길동"));
        students.add(new Student(2, "홍", "길동2"));
        students.add(new Student(3, "홍", "길동3"));
        students.add(new Student(4, "홍", "길동4"));

        return students;
    }

    //    http://localhost:8080/student/1/홍/길동
    @GetMapping("/student/{id}/{firstName}/{lastName}")
    public Student studentPathVariable(
            @PathVariable("id") int studentId
            , @PathVariable("firstName") String f_name
            , @PathVariable("lastName") String l_name ) {
        return  new Student( studentId , f_name, l_name );
    }


    //    http://localhost:8080/student/query?id=1&firstName=홍&lastName=길동
    @GetMapping("student/query")
    public Student studentRequestVariable(@RequestParam int id
            , @RequestParam("firstName") String f_name
            , @RequestParam("lastName") String l_name ) {

        return new Student(id, f_name, l_name);
    }






}
