package test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Friend;
import model.Post;
import model.User;
import model.UserDetails;
import util.HibernateUtil;

import model.Admin;
import model.Customer;


import javax.persistence.CascadeType;

public class Main {

    public static void main(String[] args) {

    	// =========================================
    	
    	// Add User with UserDetails
    	// USING CASCADE
    	// =========================================

    	Session session = HibernateUtil.getSessionFactory().openSession();

    	Transaction tx = session.beginTransaction();

    	User user1 = new User("Ahmed", 32);

    	UserDetails details = new UserDetails(
    	        "Alexandria",
    	        "01011111"
    	);

    	user1.setUserDetails(details);

    	session.save(user1);

    	tx.commit();

    	session.close();

    	System.out.println("User and UserDetails saved using Cascade");


    	// =========================================
    	
    	// Add User with Friends
    	// USING CASCADE
    	// =========================================

    	session = HibernateUtil.getSessionFactory().openSession();

    	tx = session.beginTransaction();

    	User user2 = new User("Mohamed", 28);

    	Friend friend1 = new Friend("Ali");
    	Friend friend2 = new Friend("Omar");

    	user2.getFriends().add(friend1);
    	user2.getFriends().add(friend2);

    	friend1.getUsers().add(user2);
    	friend2.getUsers().add(user2);

    	session.save(user2);

    	tx.commit();

    	session.close();

    	System.out.println("User and Friends saved using Cascade");


    	// =========================================
    	
    	// Add User with Posts
    	// USING CASCADE
    	// =========================================

    	session = HibernateUtil.getSessionFactory().openSession();

    	tx = session.beginTransaction();

    	User user3 = new User("Khaled", 25);

    	Post post1 = new Post(
    	        "My First Post",
    	        "Hello Hibernate"
    	);

    	Post post2 = new Post(
    	        "My Second Post",
    	        "Learning Java"
    	);

    	post1.setUser(user3);
    	post2.setUser(user3);

    	user3.getPosts().add(post1);
    	user3.getPosts().add(post2);

    	session.save(user3);

    	tx.commit();

    	session.close();

    	System.out.println("User and Posts saved using Cascade");
    
    
    
    
    
    	  Session session1 =
                  HibernateUtil.getSessionFactory().openSession();

          Transaction tx1 = session1.beginTransaction();

          Admin admin =
                  new Admin("Ahmed", 32, "SUPER_ADMIN");

          Customer customer =
                  new Customer("Mohamed", 28, "mohamed@gmail.com");

          session1.save(admin);
          session1.save(customer);

          tx1.commit();
          session1.close();

          System.out.println("Inheritance saved successfully");
    
    
    
    
    
    
    
    }
}