package lecture_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(4);
        list.add(444);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
//        Scanner s=new Scanner(System.in);
//        String line=s.nextLine();
//        System.out.println(line+"a");
//        int n=s.nextInt();
//        System.out.println(n+2);
//        char c=s.next().charAt(0);
//        System.out.println(c);
        Integer[] nums=new Integer[5];
        nums[1]=3;
        for (int i = 0; i <5 ; i++) {
            System.out.println(nums[i]);

        }

    }
    //substring
    public static  void substring(String line){
        for (int i = 0; i <line.length() ; i++) {
            for (int j = i+1; j <=line.length() ; j++) {
                System.out.println(line.substring(i,j));

            }

        }


        }
    //find all occurences
    public static  ArrayList<Integer> find_all_occur(String line, String pattern){
        ArrayList<Integer> list=new ArrayList<>();
        int next=line.indexOf(pattern);

        while(next!=-1){
            list.add(next);
            next=line.indexOf(pattern,next+1);

        }
        return list;
    }






}
