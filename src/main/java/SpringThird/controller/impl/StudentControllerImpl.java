package SpringThird.controller.impl;

import SpringThird.controller.IStudentController;
import SpringThird.entities.Student;
import SpringThird.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/api/student") //base url
public class StudentControllerImpl implements IStudentController {


    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody  Student student){

        return studentService.saveStudent(student);
    }

    @GetMapping(path = "/list")
    @Override
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping(path = "/list/{id}")
    @Override
    public Optional<Student> getStudentById(@PathVariable(name = "id") Integer id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Integer id) {

        studentService.deleteStudent(id);

    }

    @PutMapping("/update/{id}")
    @Override
    public Student updateStudent(@PathVariable(name = "id") Integer id,@RequestBody Student updateStudent) {

        return studentService.updateStudent(id, updateStudent);
    }

}
