package uz.project.jerseycrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.project.jerseycrud.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    boolean existsByNameEqualsIgnoreCaseAndIdNot(String name, Integer id);

    boolean existsByNameEqualsIgnoreCase(String name);

    List<Student> findAllByOrderByIdAsc();
}
