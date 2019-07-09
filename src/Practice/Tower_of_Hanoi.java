package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tower_of_Hanoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nDisks = s.nextInt();
        doTowers(nDisks, 'A', 'B', 'C');
        System.out.println((int)Math.pow(2,nDisks)-1);


    }

    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
            return;
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }

    }


}
