package Practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Inverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int div=  (int)Math.pow(b,2)-4*a*c;
        if(div<0){
            System.out.println("Imaginary");
        }
        else {
            div=(int)Math.sqrt(div);
            int x= (-b+div)/2*a;
            int y=(-b-div)/2*a;
            if(x==y){
                System.out.println("Real and Equal");
            }
            else {
                System.out.println("Real and Distinct");
            }
            System.out.print(y+" ");
            System.out.print(x);
        }


    }
}