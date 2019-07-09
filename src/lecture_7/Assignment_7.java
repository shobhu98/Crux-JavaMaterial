package lecture_7;

import java.util.ArrayList;

public class Assignment_7 {
    public static void main(String[] args) {
        // System.out.println(str_sum("123",0));
        //   System.out.println(strtonum("123",0,0));
        //   System.out.println(str1_rev_str2("1234","4321",0));
        //   System.out.println(isPalindrome("naman",0,4));
        String s = "p1,23;p4,35;ap";
        StringBuilder sb = new StringBuilder();
        ArrayList<String> x = new ArrayList<>();
        //StringBuilder x=new StringBuilder();

//        System.out.println(star_mod(s,sb ,0,s.length()));//
        //  System.out.println(remove_duplicates(s,sb,0,2));
        //System.out.println(move_x(s,sb,0,x));
        //System.out.println(count_hi(s,0,0));
        //    System.out.println(remove_hi(s,sb,0,0));
        // System.out.println(replace_hi_with_bye(s,sb,0,0));
        //   System.out.println(twin("axa",0,0));
        //   paranthesis("xyz(abc)",sb,0,0);

        // System.out.println(extraction("p1,2;", x, 0));
        // System.out.println(paranthesis(s,sb,0,false));
        System.out.println(ishankq(s, sb, x, 0, false));
    }


    //q-1
    public static int str_sum(String list, int sum) {
        if (list.isEmpty()) {
            return sum;
        }
        int ch = list.charAt(0) - '0';
        list = list.substring(1);

        return str_sum(list, sum + ch);

    }

    //q-2
    public static int strtonum(String list, int index, int sum) {
        if (list.isEmpty()) {
            return sum;

        }
        int ch = list.charAt(0) - '0';
        list = list.substring(1);
        return strtonum(list, index, 10 * sum + ch);

    }

    //q-3
    public static boolean str1_rev_str2(String str1, String str2, int index) {
        if (str1.length() != str2.length()) {
            return false;
        }
        if (index == str1.length()) {
            return true;
        }
        if (str1.charAt(index) == str2.charAt(str2.length() - 1 - index)) {
            //doubt here
            boolean b = str1_rev_str2(str1, str2, index + 1);
            return b;
        }
        return false;
    }

    //q-4
    public static boolean isPalindrome(String str, int start, int end) {
        if (start == end) {
            return true;
        }
        if (str.charAt(start) == str.charAt(end)) {
            return isPalindrome(str, start + 1, end - 1);
        }
        return false;
    }

    //q-5
    public static String star_mod(String str, StringBuilder s, int start, int end) {
        if (start == str.length() - 1) {
            s.append(str.charAt(start));
            return s.toString();
        }
        if (str.charAt(start) == str.charAt(start + 1)) {
            s.append(str.charAt(start) + "*");
            return star_mod(str, s, start + 1, end);
        }
        return star_mod(str, s.append(str.charAt(start)), start + 1, end);


    }

    //q-6
    public static String remove_duplicates(String str, StringBuilder s, int start, int end) {
        if (start == str.length() - 1) {
            s.append(str.charAt(start));
            return s.toString();
        }
        if (str.charAt(start) == str.charAt(start + 1)) {

            return remove_duplicates(str, s, start + 1, end);
        }
        return remove_duplicates(str, s.append(str.charAt(start)), start + 1, end);
    }

    //q-7
    public static String move_x(String str, StringBuilder s, int start, StringBuilder x) {
        if (start == str.length() - 1) {
            s.append(str.charAt(start));
            s.append(x);
            return s.toString();
        }
        if (str.charAt(start) == 'x') {

            x.append('x');
            return move_x(str, s, start + 1, x);


        }
        return move_x(str, s.append(str.charAt(start)), start + 1, x);

    }

    //q-8-a
    public static int count_hi(String str, int start, int count) {
        if (start == str.length()) {
            return count;
        }
        if (str.charAt(start) == 'h' && str.charAt(start + 1) == 'i') {

            return count_hi(str, start + 2, count + 1);

        }
        return count_hi(str, start + 1, count);
    }

    //q-8-b
    public static String remove_hi(String str, StringBuilder s, int start, int count) {
        if (start == str.length()) {
            return s.toString();
        }
        if (str.charAt(start) == 'h' && str.charAt(start + 1) == 'i') {

            return remove_hi(str, s, start + 2, count + 1);

        }
        return remove_hi(str, s.append(str.charAt(start)), start + 1, count);
    }

    // q-8-c
    public static String replace_hi_with_bye(String str, StringBuilder s, int start, int count) {
        if (start == str.length()) {
            return s.toString();
        }
        if (str.charAt(start) == 'h' && str.charAt(start + 1) == 'i') {

            return replace_hi_with_bye(str, s.append("bye"), start + 2, count + 1);

        }
        return replace_hi_with_bye(str, s.append(str.charAt(start)), start + 1, count);
    }

    //q-10
    public static int twin(String str, int start, int count) {
        if (start == str.length() - 2) {
            return count;
        }
        if (str.charAt(start) == str.charAt(start + 2)) {

            return twin(str, start + 1, count + 1);

        }
        return twin(str, start + 1, count);
    }

    //    public static void paranthesis(String str,StringBuilder s,int start,int end){
//        if(start==str.length()-1){
//            return;
//        }
//        if(str.charAt(end)==')'){
//            System.out.println(s.toString());
//            return;
//        }
//
//        if(str.charAt(start)=='('){
//
//            paranthesis(str,s.append(str.charAt(start+1)),start,start+1);
//
//        }
//        paranthesis(str,s,start+1,start+1);
//
//    }
    // q-14
    public static String paranthesis(String str, StringBuilder s, int start, boolean f) {
        if (str.charAt(start) == ')') {
            return s.toString();
        }
        if (f) {
            return paranthesis(str, s.append(str.charAt(start)), start + 1, true);
        }
        if (str.charAt(start) == '(') {
            return paranthesis(str, s, start + 1, true);
        }
        return paranthesis(str, s, start + 1, false);
    }

    public static ArrayList<String> ishankq(String str, StringBuilder s, ArrayList<String> list, int start, boolean f) {
        if (start==str.length()-1) {
            return list;
        }
        if (str.charAt(start) == ';') {
           String  x = s.toString();
            list.add(x);
            x="";
            s.setLength(0);
            return ishankq(str, s, list, start + 1, false);
        }

//        }
            if (f) {
                return ishankq(str, s.append(str.charAt(start)), list, start + 1, true);
            }
            if (str.charAt(start) == ',') {
                return ishankq(str, s, list, start + 1, true);
            }
            return ishankq(str, s, list, start + 1, false);


    }
    // q-13
//    public static boolean automata(String line,int index){
//        if(index==line.length()){
//            return  true;
//        }
//        if(line.charAt(0)!='a'){
//            return false;
//        }
//        if(line.startsWith("a",index){
//            if(!line.startsWith()
//
//        }
//    }

    //q-15
//    public static boolean isBalanced(String processed,String line,int index){
//        if(index==line.length()){
//            return  true;
//        }
//        char f=line.charAt(index);
//        if(f=='('||f=='{'||f=='['){
//            return isBalanced(processed+f,line,index+1)
//        }
//

    public static void sets(int[] nums,int index,ArrayList<Integer> first,ArrayList<Integer> second,int f_sum,int s_sum){
        if(index==nums.length){
            if(f_sum==s_sum){
                System.out.println(first+"-"+second);
            }
            return;


        }
        first.add(nums[index]);
        sets(nums,index+1,first,second,f_sum+nums[index],s_sum);
        first.remove(first.size()-1);

    }


}


