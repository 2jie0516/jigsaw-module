package dbModule;

import modelModule.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import serviceModule.StudentService;

public class DbService implements StudentService {
    private static final Logger logger = LogManager.getLogger(DbService.class);

    public DbService() {
        logger.info("DB Service test log");
    }

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
