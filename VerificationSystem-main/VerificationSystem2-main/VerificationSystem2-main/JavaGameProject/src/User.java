public class User {
    private int id;
    private String mailAdres;
    private String password;

    public User(int id,String mailAdres,String password){
        this.id=id;
        this.mailAdres=mailAdres;
        this.password = password;
    }
    public User(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMailAdres() {
        return mailAdres;
    }

    public void setMailAdres(String mailAdres) {
        this.mailAdres = mailAdres;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId(){
        return this.id;
    }

}
