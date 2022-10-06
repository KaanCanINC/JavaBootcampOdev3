package DataAccess;

import Entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course Course) {
        System.out.println("Hibernate ile Veritabanina gonderildi");           
    }
    
}
