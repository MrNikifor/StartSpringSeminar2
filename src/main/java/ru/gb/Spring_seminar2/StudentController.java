package ru.gb.Spring_seminar2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    private StudentRepository repository;

    @Autowired
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Student> getAll() {
        return repository.getAll();
    }
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return repository.getById(id);
    }
    @GetMapping("/search_by_group/{group}")
    public List<Student> getByGroup(@PathVariable String group) {
        System.out.println(repository.getByGroup(group));
        return repository.getByGroup(group);
    }

    @GetMapping("/search")
    public Student getByName(@RequestParam String studentName) {
        return repository.getByName(studentName);
    }
}
