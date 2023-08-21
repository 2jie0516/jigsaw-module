package clientModule;

import baseModule.Chicken;
import dbModule.DbService;
import modelModule.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import serviceModule.StudentService;

public class StudentClient {
    private static final Logger logger = LogManager.getLogger(StudentClient.class);
    public StudentClient() {
        logger.info("Student Client test log");
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();

        StudentService service = new DbService();
        service.create(new Student());
        service.read("17SS0001");
        service.update(new Student());
        service.delete("17SS0001");
    }
}
