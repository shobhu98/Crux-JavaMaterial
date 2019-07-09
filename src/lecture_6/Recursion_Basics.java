package lecture_6;

import java.math.BigInteger;

public class Recursion_Basics {
    public static void main(String[] args) {
      //  pd(5);
       // pi(5);
       // int result=pow(5,8);
        System.out.println(fibonacci(9));
    }
    public static  void pd(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pd(n-1);
    }
    public static  void pi(int n){
        if(n==0){
            return;
        }

        pi(n-1);
        System.out.println(n);
    }
    public static int  pow(int x,int n){
        if(n==0){
            return 1;
        }
     return   x* pow(x,n-1);
    }
    public static BigInteger powBig(int x,int n){
        if(n==0){
            return  BigInteger.ONE;
        }
        return new BigInteger(Integer.toString(x)).multiply(powBig(x,n-1));

    }
    public static  BigInteger factorial(int n){
        if(n==1){
            return BigInteger.ONE;
        }
        return new BigInteger(Integer.toString(n)).multiply(factorial(n-1));
    }
    public  static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
