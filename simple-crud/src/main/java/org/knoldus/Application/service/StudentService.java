package org.knoldus.Application.service;

import org.knoldus.Application.entity.StudentEntity;
import org.knoldus.Application.model.Student;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class StudentService {
    public List<Student> get() {
        List<StudentEntity> listAll = StudentEntity.findAll().list();
        return listAll.stream().map(ie -> {
            return new Student(ie.id, ie.first_name, ie.last_name);
        }).collect(Collectors.toList());
    }

    @Transactional
    public StudentEntity create(Student student) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.first_name = student.getFirst_name();
        studentEntity.last_name = student.getLast_name();
        studentEntity.persist();
        return studentEntity;
    }

    @Transactional
    public StudentEntity update(Student Student) {
        StudentEntity entity = StudentEntity.findById(Student.getId());
        entity.first_name = Student.getFirst_name();
        entity.last_name = Student.getLast_name();
        return entity;
    }

    @Transactional
    public void delete(Long id) {
        StudentEntity.deleteById(id);
    }
    
}
