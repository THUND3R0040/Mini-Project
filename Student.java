public class Student extends Human {
    private Course enrolledCourse;

    public Student(String studentId, String studentName,int age, Course enrolledCourse) {
        super(studentId, studentName, age);
        this.enrolledCourse = enrolledCourse;
    }

    // Getters and setters
    
    public Course getEnrolledCourse() { return enrolledCourse; }
    public void setEnrolledCourse(Course enrolledCourse) { this.enrolledCourse = enrolledCourse; }

    

    // Other methods, if needed
    public void showStudentInfo(){
        System.out.println("Student ID: " + this.getId());
        System.out.println("Student Name: " + this.getFullName());
        System.out.println("Student Age: " + this.getAge());
        System.out.println("Enrolled Course: " + this.enrolledCourse.getCourseName());
    }


}