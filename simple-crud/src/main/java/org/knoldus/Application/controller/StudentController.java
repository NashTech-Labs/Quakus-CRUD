package org.knoldus.Application.controller;

import org.knoldus.Application.entity.StudentEntity;
import org.knoldus.Application.model.Student;
import org.knoldus.Application.service.StudentService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

 @Path("/student")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public class StudentController {

     @Inject
     StudentService studentService;

        @GET
       public List<Student> get() { return studentService.get();}
        @POST
        public StudentEntity create(Student student){
            StudentEntity studentEntity = studentService.create(student);
            return studentEntity;
        }

        @PUT
        public StudentEntity update(Student student){
            StudentEntity studentEntity = studentService.update(student);
            return studentEntity;
     }
        @DELETE
        @Path("{id}")
        public void delete(@PathParam("id") Long id){
            studentService.delete(id);
        }

 }

