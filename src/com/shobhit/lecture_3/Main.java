package com.shobhit.lecture_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        temp();
        System.out.println("print shown");

    }

    public static void  temp(){
        Scanner s= new Scanner(System.in);
//        int start=s.nextInt();
//        int end=s.nextInt();
//        int step=s.nextInt();
        int a= s.nextInt();
        int b= s.nextInt();

       int x= swap(a,b);
        System.out.println(a);
        System.out.println(b);

//        while(start<=end){
//            float c=(5/9f)*(start-32);
//            System.out.printf("%.3f",c);
//            start=start+step;
//
//        }
    }
    public static int swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        return a;


    }
}
