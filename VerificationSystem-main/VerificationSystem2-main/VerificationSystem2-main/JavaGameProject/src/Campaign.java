public class Campaign extends Game{
    private int campaignId;
    private String campaignName;
    private int discount;
    private int campaignDuration;

    public Campaign(int gameId, double unitPrice, String gameName, int campaignId, String campaignName, int discount, int campaignDuration) {
        super(gameId, unitPrice, gameName);
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.discount = discount;
        this.campaignDuration = campaignDuration;
    }
    public Campaign(){

    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getCampaignDuration() {
        return campaignDuration;
    }

    public void setCampaignDuration(int campaignDuration) {
        this.campaignDuration = campaignDuration;
    }
}
