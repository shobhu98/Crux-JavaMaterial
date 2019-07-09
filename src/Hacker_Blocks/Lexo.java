package Hacker_Blocks;

import java.util.Scanner;

public class Lexo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String  line=s.nextLine();
        int[] nums=freq(line);
        lexo("",nums,line.length(),line);



    }
    public static int[] freq(String line){
        int[] nums=new int[26];
        for (int i = 0; i <line.length() ; i++) {
            int pos=line.charAt(i)-'a';
            nums[pos]++;
        }
        return nums;

    }
    public static void lexo(String processed,int[] nums,int len,String line){
        if(processed.length()==len){
       //     System.out.println(processed);
            return;
        }
        for (int i = 0; i <line.length() ; i++) {
            if(nums[i]>0){
                char ch=(char)('a'+i);
                System.out.println(processed+ch);


                nums[i]--;
              //  System.out.println(processed+ch);


                lexo(processed+ch,nums,len,line);
                nums[i]++;
            }

        }


    }

}
