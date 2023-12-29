import java.util.Vector;

public class PunishedStudent {
    private static Vector<Student> Punished = new Vector<>();

    public static void addPunished(Student s){
        Punished.add(s);
    }

    public static void removePunished(Student s){
        Punished.remove(s);
    }

    public static void showPunished(){
        for(int i =0;i<Punished.size();i++){
            Punished.get(i).showStudentInfo();
        }
    }
}
