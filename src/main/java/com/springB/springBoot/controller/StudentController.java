package com.springB.springBoot.controller;

import com.springB.springBoot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students") // 공통 url
public class StudentController {

    //    http://localhost:8080/student
    @GetMapping("/student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student(
                1, "홍", "길동"
        );

        // return new ResponseEntity<>(student, HttpStatus.OK);
        return ResponseEntity.ok()
                .header("custom-header", "no korea words")
                .body(student);

    }

    //    http://localhost:8080/students
    @GetMapping("")
    public ResponseEntity< List<Student>> getStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "홍", "길동"));
        students.add(new Student(2, "홍", "길동2"));
        students.add(new Student(3, "홍", "길동3"));
        students.add(new Student(4, "홍", "길동4"));

        return ResponseEntity.ok(students);
    }

    //    http://localhost:8080/student/1/홍/길동
    @GetMapping("/{id}/{firstName}/{lastName}")
    public ResponseEntity<Student> studentPathVariable(
            @PathVariable("id") int studentId
            , @PathVariable("firstName") String fName
            , @PathVariable("lastName") String lName ) {

        Student student = new Student( studentId , fName, lName );
        return ResponseEntity.ok(student);

    }


    //    http://localhost:8080/student/query?id=1&firstName=홍&lastName=길동
    @GetMapping("/query")
    public ResponseEntity<Student> studentRequestVariable(
            @RequestParam int id
            , @RequestParam("firstName") String f_name
            , @RequestParam("lastName") String l_name ) {

        Student student = new Student(id, f_name, l_name);
        return ResponseEntity.ok(student);
    }


    @PostMapping("/create")
    //  @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createStudent(@RequestBody Student student ) {

        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<Student> updateStudent(
            @RequestBody Student student
            , @PathVariable("id")  int studentId) {

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id")  int studentId) {

        System.out.println(studentId);
        return ResponseEntity.ok("삭제 성공!");
    }




}
