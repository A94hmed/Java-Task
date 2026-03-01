package ProbN;

public class Child extends Parent{
    public Child(char x) {
        super(x);
    }


    public void Case() {
        char ch = getX();

        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
        } else if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        System.out.println(ch);
    }
}
