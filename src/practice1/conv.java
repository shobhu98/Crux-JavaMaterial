package practice1;

import java.util.Scanner;

public class conv {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="1234";
    //    System.out.println(str);
       // System.out.println((int)(str.charAt(3)-'0'));
       // System.out.println(str.charAt(str.length()-1));
     System.out.println(converter(0,str,str.length()-1,1));






    }

    public static int converter(int sum,String str,int k,int i){
      //  System.out.println(sum);
        if(k<0){
            return sum;
        }
        else {
            return converter(sum+i*(str.charAt(k)-'0'),str,k-1,i*10);
        }


    }
}
