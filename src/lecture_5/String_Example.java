package lecture_5;

public class String_Example {
    public static void main(String[] args) {
        System.out.println( isPalindrome("naman"));

    }
    public static boolean isPalindrome(String line){
        int n=line.length();
        for (int i = 0; i < n/2; i++) {
            if(line.charAt(i)!=line.charAt(n-i-1)){
                return false;
            }

        }
        return true;

    }
//    public static  boolean isPalindromesub(String line){
//        int count=0;
//        for (int i = 0; i <line.length() ; i++) {
//            int left=i;
//            int right=i;
//            while(left>=0&&right<line.length())
//
//        }
//    }
}
