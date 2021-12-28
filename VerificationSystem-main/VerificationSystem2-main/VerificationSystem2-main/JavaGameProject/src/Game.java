public class Game {

    private int gameId;
    private double unitPrice;
    private String gameName;

    public Game(int gameId, double unitPrice, String gameName) {
        this.gameId = gameId;
        this.unitPrice = unitPrice;
        this.gameName = gameName;
    }
    public Game(){

    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
