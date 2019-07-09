package lecture_5;

import java.util.ArrayList;

public class String_concept {
    public static void main(String[] args) {
//        String first="hello";
//        String second="hello";
//        System.out.println(first==second);
//        System.out.println(first.equals(second));

//        for (int i = 0; i <first.length() ; i++) {
//            System.out.println(first.charAt(i));
//
//        }
        //substring
   //     System.out.println(first.substring(1));
       // substring("hello");
        System.out.println( find_all_occ("hello","el"));

    }
    public static  void substring(String line){
        for (int i = 0; i <line.length() ; i++) {
            for (int j = i+1; j <=line.length() ; j++) {
                System.out.println(line.substring(i,j));

            }

        }
    }
    //index  of usage finding occurence of a pattern
    //using index of
    public static ArrayList<Integer> find_all_occ(String line,String pattern){
        ArrayList<Integer> list = new ArrayList<>();
        int next = line.indexOf(pattern);

        while (next != -1){
            list.add(next);

            next = line.indexOf(pattern, next + 1);
        }

        return list;
    }

}
