package practice1;

import java.util.LinkedList;
import java.util.Scanner;

public class Stack_duplicate_paranthesis {
    public static  void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int t=s.nextInt();


        for (int i = 0; i <t ; i++) {
            LinkedList<Character> st=new LinkedList<>();
       //     System.out.println("enter string");
            String str=s.next();
         //   System.out.println("enter");
            boolean flag=false;

            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)=='('){
                    st.addLast(str.charAt(j));
                    continue;
                }
              else  if(str.charAt(j)==')'){
                    if(st.getLast()=='('){
                       st.removeLast();
                       continue;

                    }
                    else {
                        st.addLast(str.charAt(j));
                    }

              }
              else {
                  continue;
                }



            }
            System.out.println(st.getLast());

            if(st.isEmpty()){
                System.out.println("No Duplicates Found");
                flag=true;
            }
            else {
                System.out.println("Duplicates Found");
            }
        }
    }
}
