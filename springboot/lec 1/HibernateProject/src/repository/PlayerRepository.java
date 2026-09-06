package repository;

import model.Player;

public interface PlayerRepository {

    void save(Player player);

    void update(Player player);

    void delete(Long id);

    Player getById(Long id);
}