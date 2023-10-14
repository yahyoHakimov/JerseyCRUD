package uz.project.jerseycrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.project.jerseycrud.dto.StudentDto;
import uz.project.jerseycrud.entity.Student;
import uz.project.jerseycrud.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService{

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAllByOrderByIdAsc();
    }

    public Student addStudent(StudentDto studentDto) {
        Student student = new Student();
        if (!studentRepository.existsByNameEqualsIgnoreCase(studentDto.getName())) {
            student.setId(studentDto.getId());
            student.setName(studentDto.getName());
            student.setGroup(student.getGroup());
            studentRepository.save(student);
        } else {
            new Exception("Bunday talaba mavjud");
        }
        return student;
    }

    public Student editStudent(Integer id, StudentDto dto) {
        Student student = new Student();
        if(!studentRepository.existsByNameEqualsIgnoreCaseAndIdNot(dto.getName(), dto.getId())) {
            student.setName(dto.getName());
            student.setGroup(dto.getGroup());
            studentRepository.save(student);
        }
        return student;
    }

    public void deleteStudent(Integer id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            new Exception("Bu talaba bazada mavjud emas.");
        }
    }

}
