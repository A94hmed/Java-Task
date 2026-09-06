package Main;

import model.Player;
import repository.PlayerRepository;
import repository.PlayerRepositoryImpl;

public class Main {

    public static void main(String[] args) {

        PlayerRepository repository = new PlayerRepositoryImpl();

        // =========================
        // SAVE
        // =========================

        Player player = new Player("Ahmed", 25, true);

        repository.save(player);

        System.out.println(player);


        // =========================
        // UPDATE
        // =========================

        player.setName("Ahmed Elnagar");
        player.setAge(26);
        player.setStatus(false);

        repository.update(player);

        System.out.println(player);


        // =========================
        // GET BY ID
        // =========================

        Player foundPlayer = repository.getById(player.getId());

        System.out.println("Player from DB:");
        System.out.println(foundPlayer);


        // =========================
        // DELETE
        // =========================

        repository.delete(player.getId());
    }
}