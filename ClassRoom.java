import java.util.Vector;

public class ClassRoom {
    private String roomId;
    private int capacity;
    Vector <Student> studentsInClass = new Vector<Student>();
 
    public ClassRoom(String roomId, int capacity) {
        this.roomId = roomId;
        this.capacity = capacity;
    }

    // Getters and setters
    public String getRoomId() { return roomId; }
    public void setRoomId(String roomId) { this.roomId = roomId; }
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }


    // Other methods, if needed
    public void addStudent(Student s){
        studentsInClass.add(s);
    }
    public boolean isEmpty(){
        if(studentsInClass.size()==0){
            return true;
        }
        else{
            return false;
        }
    }

    public void removeStudent(Student s){
        studentsInClass.remove(s);
    }
    

}
