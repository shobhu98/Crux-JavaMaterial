package lecture_7;

import com.sun.jdi.event.StepEvent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
       // String line = s.nextLine();
        //printSubsequence("", line);
        // int digit='a'-'0';
        // System.out.println(digit);
        //numpad("", "he");
        //permutation("","abc");
//        String s="a";
//        System.out.println(s.substring(0,0));

    }
    //printing subsequence of a string

    public static void printSubsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        printSubsequence(processed + first, unprocessed);
        printSubsequence(processed, unprocessed);
    }

    //subsequence and ascii
    public static void printSubsequence_ascii(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        printSubsequence_ascii(processed + first, unprocessed);
        printSubsequence_ascii(processed + (int) (first), unprocessed);
        printSubsequence_ascii(processed, unprocessed);
    }

    public static void numpad(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        int digit = unprocessed.charAt(0) - '0';
        unprocessed = unprocessed.substring(1);
        for (int i = 3 * (digit - 1); i < 3 * digit; i++) {
            if (i == 26) {
                continue;
            }
            char ch = (char) (i + 'a');
            numpad(processed + ch, unprocessed);

        }


    }

    public static void permutation(String procesed, String unprocesed) {
        if (unprocesed.isEmpty()) {
            System.out.println(procesed);
            return;
        }
        char ch = unprocesed.charAt(0);
        unprocesed = unprocesed.substring(1);
        for (int i = 0; i <= procesed.length(); i++) {
            String first = procesed.substring(0, i);
            String last = procesed.substring(i);
            permutation(first + ch +  last, unprocesed);

        }
    }

    public static void dice(String processed, int target) {
        if (target == 0) {
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(processed + i, target - i);

        }

    }
    public static void permutation_stringbuilder(StringBuilder procesed, StringBuilder unprocesed) {
        if (unprocesed.length()==0) {
            System.out.println(procesed);
            return;
        }
        char ch = unprocesed.charAt(0);
        unprocesed = unprocesed.deleteCharAt(0);
        for (int i = 0; i <= procesed.length(); i++) {
            procesed.insert(i,ch);
            permutation_stringbuilder(procesed,unprocesed);
            procesed.deleteCharAt(i);

        }
        unprocesed.insert(0,ch);
    }
}
