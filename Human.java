public class Human {
    private String Id;
    private String fullName;
    private int Age;

    public Human(String id, String fullName, int age) {
        Id = id;
        this.fullName = fullName;
        Age = age;
    }

    public String getId() { return Id; }
    public void setId(String id) { Id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public int getAge() { return Age; }
    public void setAge(int age) { Age = age; }

    
}
