package uz.project.jerseycrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import uz.project.jerseycrud.dto.StudentDto;
import uz.project.jerseycrud.entity.Student;
import uz.project.jerseycrud.repository.StudentRepository;
import uz.project.jerseycrud.service.StudentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentService service;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student addStudent(StudentDto studentDto) {
        return service.addStudent(studentDto);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents() {
        return service.getAll();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student editStudent(@PathParam("id") int id, StudentDto studentDto) {
        return service.editStudent(id, studentDto);
    }

    @DELETE
    @Path("/{id}")
    public void deleteStudent(@PathParam("id") int id) {
         service.deleteStudent(id);
    }


}
