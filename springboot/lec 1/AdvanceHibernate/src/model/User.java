package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    @OneToOne(
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY
    )
    @JoinColumn(name = "user_details_id")
    private UserDetails userDetails;

    @ManyToMany(
        cascade = CascadeType.ALL
    )
    @JoinTable(
        name = "user_friend",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "friend_id")
    )
    private Set<Friend> friends = new HashSet<>();

    @OneToMany(
        mappedBy = "user",
        cascade = CascadeType.ALL
    )
    private List<Post> posts = new ArrayList<>();

    public User() {

    }

    public User(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public Long getId() {

        return id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public UserDetails getUserDetails() {

        return userDetails;

    }

    public void setUserDetails(UserDetails userDetails) {

        this.userDetails = userDetails;

    }

    public Set<Friend> getFriends() {

        return friends;

    }

    public void setFriends(Set<Friend> friends) {

        this.friends = friends;

    }

    public List<Post> getPosts() {

        return posts;

    }

    public void setPosts(List<Post> posts) {

        this.posts = posts;

    }
}