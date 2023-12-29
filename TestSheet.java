public class TestSheet {
    private String testSheetId;
    private Student student;
    private Exam exam;
    private int marks;

    public TestSheet(String testSheetId, Student student, Exam exam, int marks) {
        this.testSheetId = testSheetId;
        this.student = student;
        this.exam = exam;
        this.marks = marks;
    }

    // Getters and setters
    public String getTestSheetId() { return testSheetId; }
    public void setTestSheetId(String testSheetId) { this.testSheetId = testSheetId; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
    public Exam getExam() { return exam; }
    public void setExam(Exam exam) { this.exam = exam; }
    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    // Other methods, if needed
}
