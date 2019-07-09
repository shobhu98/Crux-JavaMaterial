package practice1;

import java.util.Scanner;

public class conversion_far_tocel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int min=s.nextInt();
        int max=s.nextInt();
        int step=s.nextInt();
        for (int i = min; i <=max ; i=i+step) {
            int c=(5*(i-32))/9;
            System.out.println(i+" "+c);


        }
    }
}
