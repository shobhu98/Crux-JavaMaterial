package Practice;

import java.util.Scanner;

public class Obedient_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String str=s.nextLine();
        //System.out.println(str);
        //System.out.println(str.length());
        System.out.println(obedient_string(str,0));


    }

    public static boolean obedient_string(String str,int index){
        if(str.charAt(0)!='a'){
            return false;
        }

        if(str.length()-1<=index){
            return true;
        }
        if(str.charAt(str.length()-2)=='a'){
            if(str.length()-1=='a'){
                return true;
            }
            else {
                return false;
            }
        }
        if(str.charAt(index)=='a'){
            if(str.charAt(index+1)=='a'){
//                System.out.print('x');
//                System.out.println(index);
              return   obedient_string(str,index+1);
            }
            if(str.charAt(index+1)=='b'&&str.charAt(index+2)=='b'){
//                System.out.print('y');
//
//                System.out.println(index);

                return obedient_string(str,index+2);

            }


        }
        if(str.charAt(index)=='b'){
            if(str.charAt(index+1)=='a'){
//                System.out.print('z');
//
//                System.out.println(index);
                return   obedient_string(str,index+1);
            }
            else {
                return false;
            }
        }
        return false;
    }
}
