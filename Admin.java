public class Admin extends Human{
    
    public Admin(String adminId, String adminName,int age) {
        super(adminId, adminName, age);
    }

    
    

    public void punishStudent(Student s){
        PunishedStudent.addPunished(s); 
    }
    public void removePunishedStudent(Student s){
        PunishedStudent.removePunished(s);
    }
    public void showPunishedStudents(){
        PunishedStudent.showPunished();
    }
}
