public class Player extends User{

    private int playerId;
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String natioanalId;

    public Player(int id, String mailAdres, String password, int playerId, String firstName, String lastName, int dateOfBirth, String natioanalId) {
        super(id, mailAdres, password);
        this.playerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.natioanalId = natioanalId;
    }
    public  Player(){

    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNatioanalId() {
        return natioanalId;
    }

    public void setNatioanalId(String natioanalId) {
        this.natioanalId = natioanalId;
    }
}
