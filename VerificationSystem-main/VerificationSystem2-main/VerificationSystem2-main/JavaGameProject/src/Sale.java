public class Sale extends Game{

    private int saleId;
    private int quality;

    public Sale(int gameId, double unitPrice, String gameName, int saleId, int quality) {
        super(gameId, unitPrice, gameName);
        this.saleId = saleId;
        this.quality = quality;
    }
    public  Sale(){

    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
