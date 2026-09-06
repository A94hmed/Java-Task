package repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Player;
import util.HibernateUtil;

public class PlayerRepositoryImpl implements PlayerRepository {

    private SessionFactory sessionFactory;

    public PlayerRepositoryImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void save(Player player) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(player);

        transaction.commit();

        session.close();

        System.out.println("Player saved successfully");
    }

    @Override
    public void update(Player player) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.update(player);

        transaction.commit();

        session.close();

        System.out.println("Player updated successfully");
    }

    @Override
    public void delete(Long id) {

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Player player = session.get(Player.class, id);

        if (player != null) {
            session.delete(player);
            System.out.println("Player deleted successfully");
        } else {
            System.out.println("Player not found");
        }

        transaction.commit();

        session.close();
    }

    @Override
    public Player getById(Long id) {

        Session session = sessionFactory.openSession();

        Player player = session.get(Player.class, id);

        session.close();

        return player;
    }
}