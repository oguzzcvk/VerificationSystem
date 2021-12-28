public class CampaignManager implements CampaignService{
    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya Kaydedildi: "+campaign.getCampaignName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya Güncellendi: "+campaign.getCampaignName()+" "+campaign.getCampaignDuration()
        +" süreliğine");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya silinid: "+campaign.getCampaignName());

    }
}
