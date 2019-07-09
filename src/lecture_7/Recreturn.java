package lecture_7;

import java.util.ArrayList;

public class Recreturn {
    public static void main(String[] args) {

    }
    public static void printSubsequence(String processed, String unprocessed, ArrayList<String> list) {
        if (unprocessed.isEmpty()) {
            if(!processed.isEmpty()){
                list.add(processed);
            }
            return;
        }
        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        printSubsequence(processed + first, unprocessed,list);
        printSubsequence(processed, unprocessed,list);
    }
//    public static ArrayList<String> printSubsequence_arraylist(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            if(!processed.isEmpty()){
//                list.insert_to_rear(processed);
//            }
//            return;
//        }
//        char first = unprocessed.charAt(0);
//        unprocessed = unprocessed.substring(1);
//       ArrayList<String> left=printSubsequence_arraylist(processed,unprocessed)
//    }
}
