// Course.java

import java.util.Vector;

public class Course {
    private String courseId;
    private String courseName;
    private Teacher instructor;
    Vector <Student> enrolledStudents = new Vector<Student>();

    public Course(String courseId, String courseName, Teacher instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // Getters and setters

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    // Other methods, if needed
    public void addStudent(Student s){
        enrolledStudents.add(s);
    }

    public void removeStudent(Student s){
        enrolledStudents.remove(s);
    }

    public String toString() {
        String result = "";
        result += "Course ID: " + this.courseId + "\n";
        result += "Course Name: " + this.courseName + "\n";
        result += "Instructor: " + this.instructor.getFullName() + "\n";
        result += "Enrolled Students: \n";
        for (Student student : enrolledStudents) {
            result += student.toString() + "\n";
        }
        return result;
    }

}
