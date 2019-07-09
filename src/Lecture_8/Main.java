package Lecture_8;



public class Main {
    public static void main(String[] args) {

    }

    public static int sum(String number,int index){
        if(index==number.length()){
            return 0;
        }

        int digit=number.charAt(index)-'0';
        return digit+sum(number,index+1);
    }
    public static int toint(String number,int index){
        if(index==0){
            return number.charAt(index)-'0';
        }
        int digit=number.charAt(index)-'0';
        return digit+10*toint(number,index-1);
    }
    public static void duplicates(String processed,String unprocessed){
        if(unprocessed.length()<2){
            System.out.println(processed+unprocessed);
            return ;
        }
        char first =unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        if(unprocessed.charAt(0)==first){
            duplicates(processed+first+"*",unprocessed);
        }
        else{
            duplicates(processed+first,unprocessed);
        }
    }
//    public static StringBuilder dubbuilder(StringBuilder processed,StringBuilder unproceesed,int index){
//        if(index==unproceesed.length()){
//            return processed;
//        }
//        if(index==unproceesed.length()-1){
//            return  processed.append(unproceesed.charAt(index));
//        }
//        char first=unproceesed.charAt(index);
//    }
}
