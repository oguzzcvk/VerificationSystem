public class SaleManager implements SaleService{
    @Override
    public void sale(Player player, Game game, Campaign campaign) {
        System.out.println(game.getGameName()+" için sipariş verildi "+ player.getFirstName()
        +" için"+campaign.getCampaignName()+" uygulandı "+campaign.getCampaignDuration()+" süreliğine");
    }
}
