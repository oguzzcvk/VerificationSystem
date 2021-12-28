import MernisService.ATWKPSPublicSoap;

public class MernisServiceAdapter implements PersonCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        ATWKPSPublicSoap client = new ATWKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.valueOf(player.getNatioanalId()), player.getFirstName(),
                    player.getLastName(), 1999);
        }
        catch (Exception e){
            return false;
        }

    }
}
