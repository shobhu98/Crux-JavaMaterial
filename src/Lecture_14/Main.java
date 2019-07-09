package Lecture_14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(freq("abc")));
        String line="ab";
        int[] f=freq(line);
        lexo("",f,line.length());


    }
    public static int[] freq(String line){
        int[] nums=new int[26];

        for (int i = 0; i <line.length() ; i++) {
            int pos=line.charAt(i)-'a';
            nums[pos]++;
        }
        return nums;
    }
    public static void lexo(String processed,int[] f,int len){
        if(processed.length()==len){
        //    System.out.println(processed);
            return;
        }
        for (int i = 0; i <f.length ; i++) {
            if(f[i]>0){
                char ch=(char)('a'+i);
                f[i]--;
                System.out.println(processed+ch);
                lexo(processed+ch,f,len);
                f[i]++;
            }

        }


    }

}
