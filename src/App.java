import Business.CourseManager;
import Core.Logging.DBLogger;
import Core.Logging.FileLogger;
import Core.Logging.Logger;
import Core.Logging.MailLogger;
import DataAccess.HibernateCourseDao;
import Entities.Course;

public class App {

    public static void main(String[] args) throws Exception {
        
        Course course = new Course("Java", "2022 Java Kursu", "Programlama", "KaanCan", 59);

        Logger[] loggers = {new DBLogger(), new FileLogger(), new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course);
    }
}
