package practice1;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist_bubblesort_iterative {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            int x=s.nextInt();
            list.add(x);

        }
        for (int i = 0; i <t-1 ; i++) {
            for (int j = 0; j <t-i-1 ; j++) {
                int a=list.get(j);
                int b=list.get(j+1);


            }

        }

    }


}
