public class Main {

    public static void main(String[] args){

        PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());

        SaleManager saleManager = new SaleManager();
        CampaignManager campaignManager = new CampaignManager();

        Player player = new Player();
        playerManager.add(player);

        Game game = new Game();
        Sale sale = new Sale();

        Campaign campaign = new Campaign();

        campaignManager.add(campaign);

        saleManager.sale(player,game,campaign);

    }
}
