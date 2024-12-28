package SpringThird.controller;

import SpringThird.entities.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentController {


    Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Optional<Student> getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public Student updateStudent(Integer id,Student updateStudent);

}
