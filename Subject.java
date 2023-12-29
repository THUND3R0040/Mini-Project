import java.util.Vector;

public class Subject {
    private String subjectCode;
    private String subjectName;
    Vector <Course> courses = new Vector<>();

    public Subject(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    // Getters and setters
    public String getSubjectCode() { return subjectCode; }
    public void setSubjectCode(String subjectCode) { this.subjectCode = subjectCode; }
    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }
    
    // Other methods, if needed
    public void addCourse(Course c){
        courses.add(c);
    }
    public void removeCourse(Course c){
        courses.remove(c);
    }

    public String toString() {
        String result = "";
        result += "Subject Code: " + this.subjectCode + "\n";
        result += "Subject Name: " + this.subjectName + "\n";
        result += "Courses: \n";
        for (Course course : courses) {
            result += course.toString() + "\n";
        }
        return result;
    }
    
}
