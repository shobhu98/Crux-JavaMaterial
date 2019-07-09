package practice1;

import java.util.Scanner;

public class replace {


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        System.out.println(convert0To5Rec(t));

    }
 public static int convert0To5Rec(int num)
    {

        if (num == 0)
            return 0;


        int digit = num % 10;
        if (digit == 0)
            digit = 5;


        return convert0To5Rec(num / 10) * 10 + digit;
    }
}














