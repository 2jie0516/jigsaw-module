package main.java.dbModule;

import main.java.modelModule.Student;
import main.java.serviceModule.StudentService;

public class DbService implements StudentService {

    @Override
    public String create(Student student) {
        return student.getRegistrationId();
    }

    @Override
    public Student read(String registrationId) {
        return new Student();
    }

    @Override
    public Student update(Student student) {
        return student;
    }

    @Override
    public String delete(String registrationId) {
        return registrationId;
    }
}
