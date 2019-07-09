package Lecture_13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueExamples {
    public static void main(String[] args) {
//        Queue<Integer> queue=new LinkedList<>();
//        queue.insert_to_rear(1);
//        queue.insert_to_rear(2);
//        queue.insert_to_rear(3);
//        queue.insert_to_rear(4);
//
//        System.out.println(queue);
//        reverse(queue);
//        System.out.println(queue);

        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        stack=reverse(stack);
        System.out.println(stack);




    }
//    public static void reverse(Queue<Integer> queue){
//
//        reverseRec(queue);
//
//
//    }
//    public static void reverseRec(Queue<Integer> queue){
//        if(queue.isEmpty()){
//            return;
//        }
//        int item=queue.remove();
//        reverseRec(queue);
//        queue.insert_to_rear(item);
//    }

    public static Stack<Integer> reverse(Stack<Integer>stack){
        Stack<Integer> extra=new Stack<>();
        while (!stack.isEmpty()){
            extra.push(stack.pop());

        }
        return extra;


    }


}
