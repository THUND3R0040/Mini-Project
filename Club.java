import java.util.Vector;

public class Club {
    private String clubId;
    private String clubName;
    Vector <Human> Members = new Vector <Human>();

    public Club(String clubId, String clubName) {
        this.clubId = clubId;
        this.clubName = clubName;
    }

    // Getters and setters
    public String getClubId() { return clubId; }    
    public void setClubId(String clubId) { this.clubId = clubId; }
    public String getClubName() { return clubName; }
    public void setClubName(String clubName) { this.clubName = clubName; }

    // Other methods, if needed

    public void addMember(Human member){
        Members.add(member);
    }

    public void removeMember(Human member){
        Members.remove(member);
    }
    
    public String toString() {
        String result = "";
        result += "Club ID: " + this.clubId + "\n";
        result += "Club Name: " + this.clubName + "\n";
        result += "Members: \n";
        for (Human member : Members) {
            result += member.toString() + "\n";
        }
        return result;
    }



}