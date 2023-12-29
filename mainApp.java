public class mainApp {
    public static void main(String[] args) {
        
        Human admin = new Admin("A001", "John", 30);

        Human teacher = new Teacher("T001", "MOhsen", 54);

        Course course = new Course("C001", "Java Programming", (Teacher)teacher);

        Human student = new Student("S001", "Peter", 20,course);

        ClassRoom classRoom = new ClassRoom("C001", 30);

        Subject subject = new Subject("S001", "Java Programming");

        ((Admin)admin).punishStudent((Student)student);

        ((Admin)admin).showPunishedStudents();

        ((Teacher)teacher).addSubject(subject);

        ((Teacher)teacher).showTeacherInfo();

        ((Course)course).addStudent((Student)student);

        course.toString();

        ((Student)student).showStudentInfo();

        classRoom.addStudent((Student)student);

        subject.addCourse(course);

        subject.toString();


        subject.removeCourse(course);

        ((Admin)admin).showPunishedStudents();

        ((Admin)admin).removePunishedStudent((Student)student);

        
        
        
        
        
    }
}
