import java.util.Vector;

public class Exam {
    private String examId;
    private Course examCourse;
    private String examDate;
    Vector <TestSheet> Result = new Vector<TestSheet>();

    public Exam(String examId, Course examCourse, String examDate) {
        this.examId = examId;
        this.examCourse = examCourse;
        this.examDate = examDate;
    }

    // Getters and setters
    public String getExamId() { return examId; }
    public void setExamId(String examId) { this.examId = examId; }
    public Course getExamCourse() { return examCourse; }
    public void setExamCourse(Course examCourse) { this.examCourse = examCourse; }
    public String getExamDate() { return examDate; }
    public void setExamDate(String examDate) { this.examDate = examDate; }

    // Other methods, if needed
    public void showExamInfo(){
        System.out.println("Exam ID: " + this.examId);
        System.out.println("Exam Course: " + this.examCourse.getCourseName());
        System.out.println("Exam Date: " + this.examDate);
    }

    public void addTestSheet(TestSheet t){
        Result.add(t);
    }

    public void removeTestSheet(TestSheet t){
        Result.remove(t);
    }

    public void showResults(){
        for (TestSheet t : Result) {
            System.out.println("Student ID: " + t.getStudent().getId());
            System.out.println("Student Name: " + t.getStudent().getFullName());
            System.out.println("Student Age: " + t.getStudent().getAge());
            System.out.println("Enrolled Course: " + t.getStudent().getEnrolledCourse().getCourseName());
            System.out.println("Marks: " + t.getMarks());
        }
    }

}

