package Entities;

public class Course {
    private String courseName;
    private String description;
    private String category;
    private String instructor;
    private int unitPrice;

    public Course(){
        
    }

    public Course(String courseName, String description, String category, String instructor, int unitPrice) {
        this.courseName = courseName;
        this.description = description;
        this.category = category;
        this.instructor = instructor;
        this.unitPrice = unitPrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }



}
