package probL;

public class Parent {
    private String firstName;
    private String secondName;

    //constructor
    Parent() {

    }

    Parent(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public boolean check(Parent other) {
        if (this.getSecondName().equals(other.getSecondName())) {
            return true;
        } else {
            return false;

        }
    }



    }
