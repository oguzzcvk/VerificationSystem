public class PlayerManager implements PlayerService{
    PersonCheckService personCheckService;

    public PlayerManager(PersonCheckService personCheckService) {
        this.personCheckService = personCheckService;
    }

    @Override
    public void add(Player player) {

        if (personCheckService.checkIfRealPerson(player)){
            System.out.println("Player eklendi: "+player.getFirstName()+" "+player.getLastName());
        }
        else {
            System.out.println("Kaydedilmedi.");
        }

    }

    @Override
    public void update(Player player) {
        System.out.println(" Player Günecellendi: "+player.getFirstName());

    }

    @Override
    public void delete(Player player) {
        System.out.println("Player Silindi: "+player.getFirstName());

    }
}
