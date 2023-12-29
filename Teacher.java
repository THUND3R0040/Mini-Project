import java.util.Vector;

public class Teacher extends Human {

    Vector <Subject> Subjects = new Vector<Subject>();

    public Teacher(String teacherId, String teacherName,int age) {
        super(teacherId, teacherName, age);
    }

    // Other methods, if needed
    public void showTeacherInfo(){
        System.out.println("Teacher ID: " + this.getId());
        System.out.println("Teacher Name: " + this.getFullName());
        System.out.println("Teacher Age: " + this.getAge());
        System.out.println("Subjects: ");
        for (Subject subject : Subjects) {
            System.out.println(subject.getSubjectName());
        }
    }
    public void addSubject(Subject s){
        if (Subjects.contains(s)) {
            System.out.println("Subject already exists");
            return;
        }
        Subjects.add(s);
        System.err.println("Subject Added Successfuly");

    }
}