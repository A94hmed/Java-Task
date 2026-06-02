package Problemc;

import java.util.Scanner;

public class Count {
    int n;

    //constructor

    Count(){

    }
    Count(int n){
        this.n=n;
    }

    public void setN(int n) {

        this.n = n;
        Scanner scanner=new Scanner(System.in);
        int even=0,odd=0,positive=0,negative=0;
        for(int i=1;i<=n;i++){
            int z = scanner.nextInt();

if(z%2==0){
    even++;

} else{
   odd++;
}
if(z>0){
    positive++;
}else if(z<0){
    negative++;
}

        }
        System.out.println("Even: "+even);
        System.out.println("odd: "+odd);
        System.out.println("positive: "+positive);
        System.out.println("negative: "+negative);
    }
}
