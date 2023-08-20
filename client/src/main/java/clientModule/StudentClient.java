package main.java.clientModule;

import main.java.dbModule.DbService;
import main.java.modelModule.Student;
import main.java.serviceModule.StudentService;

public class StudentClient {
    public static void main(String[] args) {
        StudentService service = new DbService();
        service.create(new Student());
        service.read("17SS0001");
        service.update(new Student());
        service.delete("17SS0001");
    }
}
