package com.shobhit.lecture_3;

import java.util.Scanner;

public class assignment_3 {
    public static class Main {

        public static void main(String[] args) {
            ques16();
        // write your code here
        }

    public static void ques7(){
            Scanner s=new Scanner(System.in);
            int num= s.nextInt();
            int result=0;
          int  i=1;
          int temp=num;
            while(num>0){
                int v=num%10;
                result=result+ i*(int)Math.pow(10,v-1);
                        i+=1;
                num=num/10;

            }
            if(result==temp){
                System.out.println("valid"+result);
            }
            else{
                System.out.println("invalid");
            }



    }
    public static void ques9(){
        Scanner s=new Scanner(System.in);
        int num= s.nextInt();
        int result=0;
        int temp=num;
        int n=num;
        int c=0;
        while(n>0){
            n=n/10;
            c+=1;
        }

        while(num>0){
            int r=num%10;
            result=result+(int)Math.pow(r,c);
            num=num/10;
        }
        if(result==temp){
            System.out.println(result+"  is armstrongnumber");
        }
        else{
            System.out.println(temp+"  Not a armstrong number");
        }

    }
    }
    public  static  void ques11(){
        Scanner s=new Scanner(System.in);
        int num1= s.nextInt();
        int num2= s.nextInt();
        int gcd=0;
        if(num2>num1){
            int temp=num1;
            num1=num2;
            num2=temp;
        }

        int result=0;
        for (int i=1;i<=num2;i+=1){
            if(num1%i==0&&num2%i==0){
                 gcd=i;
            }
        }
        System.out.println(gcd);

    }
    public static void ques12(){
        Scanner s=new Scanner(System.in);
        int num1= s.nextInt();
        int num2= s.nextInt();
        int gcd=0;
        int lcm=0;
        if(num2>num1){
            int temp=num1;
            num1=num2;
            num2=temp;
        }

        int result=0;
        for (int i=1;i<=num2;i+=1){
            if(num1%i==0&&num2%i==0){
                gcd=i;
            }
        }
        if(num1%num2==0){
            lcm=num1;
        }
        else{
            lcm=(num1*num2)/gcd;
        }
        System.out.println(lcm);

    }
    public static void ques13(){
        Scanner s=new Scanner(System.in);
        int x= s.nextInt();
        int n= s.nextInt();
        int result=(int)Math.pow(x,n);
        System.out.println(result);
    }
    public static  void ques18(){
        Scanner s=new Scanner(System.in);
        char x=s.next().charAt(0);
        if(x>=65&&x<=90){
            System.out.println("uppercase");

        }
        else if(x>=97&&x<=122){
            System.out.println("lowercase");
             }
        else{
            System.out.println("none");
        }
        }
    public static void ques14(){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        for (int i = 0; i <x/2 ; i++) {
            if(x==Math.pow(n,i)){
                System.out.println(i);
            }



        }

    }
    public static void sqrt(int n,int approx){
        while(n<=Math.pow(approx,2)){
            approx--;

        }

    }
    public static void ques16(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int approx=n/2;

        System.out.println(approx);

    }

}


