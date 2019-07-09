package stacks;

import java.util.Scanner;
import java.util.Stack;

public class stacks_javabuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            stack.push(s.nextInt());
        }
        System.out.println(stack.elementAt(t/2));

    }
}
