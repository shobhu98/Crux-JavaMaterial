package lecture_7;

import java.util.Scanner;


public class N {


        public static void main(String args[]) {
            Scanner s=new Scanner(System.in);
            int t= s.nextInt();

            for (int i = 0; i < t; i++) {
                String x=s.next();
                subsequence("",x);

            }




        }
        public static void subsequence(String processed,String unprocessed){
            if(unprocessed.isEmpty()){
                System.out.println(processed);
                return;
            }
            char ch= unprocessed.charAt(0);
            unprocessed=unprocessed.substring(1);
            subsequence(processed+ch,unprocessed);
            subsequence(processed,unprocessed);
        }
    }

