package DataAccess;

import Entities.Course;

public class JDBCCourseDao implements CourseDao{
    @Override
    public void add(Course Course) {
        System.out.println("JDBC ile Veritabanina gonderildi");        
    }
    
}
