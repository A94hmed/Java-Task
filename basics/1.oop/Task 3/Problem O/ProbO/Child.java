package ProbO;

public class Child extends Parent{
    private char S;

    public Child(int A, char S, int B) {
        super(A, B);
        this.S = S;

    }

    public int calculate() {

        int a = getA();
        int b = getB();
        int res=0;

        if (S == '+') {
            res=(a + b);
        }
        else if (S == '-') {
            res=(a - b);
        }
        else if (S == '*') {
            res=(a * b);
        }
        else if (S == '/') {
            res=(a / b);
        }
        return res;
    }

    }


