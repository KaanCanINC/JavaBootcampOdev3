package Business;

import Core.Logging.Logger;
import DataAccess.CourseDao;
import Entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        Course[] courses = new Course[] {
                new Course("Java2", "2022 Java Kursu", "Programlama1", "KaanCan", 59),
                new Course("Java1", "2022 Java Kursu", "Programlama3", "KaanCan", 59),
        };
        for (Course c : courses) {
            if (c.getCategory() == course.getCategory()) {
                throw new Exception("Ayni kategoride birden fazla kurs olamaz");
            }
            if(c.getCourseName() == course.getCourseName()){
                throw new Exception("Ayni isimde birden fazla kurs olamaz");
            }
        }

        if (course.getUnitPrice() < 0) {
            throw new Exception("Urunun fiyati 0 olamaz");
        }

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }

    }

}
