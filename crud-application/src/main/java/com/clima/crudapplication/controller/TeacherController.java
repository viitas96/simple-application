package com.clima.crudapplication.controller;

import com.clima.crudapplication.entity.Teacher;
import com.clima.crudapplication.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/{id}")
    public Teacher getOne(@PathVariable Long id) {
        return teacherService.getOne(id);
    }

    @PostMapping
    public void save(@RequestBody Teacher teacher) {
        teacherService.save(teacher);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Teacher teacher, @PathVariable Long id) {
        teacherService.update(teacher, id);
    }

    @GetMapping
    public List<Teacher> findAll() {
        return teacherService.findALl();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        teacherService.delete(id);
    }

}
