package Lecture_10;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(power(new BigInteger("123333"),12321));

    }
    public static BigInteger  power(BigInteger x,int n){
        if(n==0){
            return  BigInteger.ONE;
        }
        BigInteger sol=power(x,n/2);
        sol=sol.multiply(sol);
        if(n%2==1){
            sol=sol.multiply(x);
        }
        return sol;
    }
}
