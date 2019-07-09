package stacks;

import org.w3c.dom.Node;

import java.util.Scanner;

public class stacks_main {
    public static void main(String[] args) {
        stacks stack1=new stacks();
        stacks stack2=new stacks();
      //  stacks aux=new stacks();
      //  stacks helper=new stacks();
       // stacks curr=new stacks();
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            stack1.push(i);

        }
        for (int i = 0; i <t ; i++) {
            stack2.push(stack1.pop());

        }
        for (int i = 0; i <t ; i++) {
            System.out.print(stack2.pop());

        }
//        for (int i = 0; i <t ; i++) {
//            stack.push(s.nextInt());
//
//        }
//        System.out.println(curr.length());
//        System.out.println(curr.top());
      // System.out.println(stack.pop());
//        while (curr.length()!=t) {
//
//            int a = stack.pop();
//          //  System.out.println(a);
//            helper.push(a);
//
//            if (curr.length() == 0) {
//                int y=helper.pop();
//                curr.push(y);
//             //   System.out.println(1);
//
//            }
//            else if(helper.top()<=curr.top()){
//                int y=helper.pop();
//                curr.push(y);
//           //     System.out.println(2);
//
//            }
//            else if(curr.top()<helper.top()) {
//                while (curr.top()<helper.top()){
//                    if(curr.top()==-999999999){
//                        break;
//                    }
//                  //  System.out.println(3);
//                    stack.push(curr.pop());
//                }
//                curr.push(helper.pop());
//
//            }
//
//
//        }
//
//        for (int i = 0; i <t ; i++) {
//            System.out.println(curr.revpop());
//
//        }
//        stack.reverse_rec_call();
//        for (int i = 0; i < t; i++) {
//            System.out.print(stack.revpop());
//
//        }







    }
}
class stacks {
    private Node head;
    private Node tail;
    private Node mid;
    private int size;

    public void push(int value) {
        Node node = new Node(value);
        int min;
        if (size == 0) {
            head = node;
            tail = node;
            mid = node;
            head.next = null;
            head.prev = null;
            size++;

        } else {
            tail.prev = node;
            node.next = tail;
            node.prev = null;

            tail = node;
            size++;


        }


    }

    public int length() {
        int i = 0;
        Node node = head;
        while (node != null) {
            node = node.prev;
            i++;
        }
        return i;

    }

    public int top() {
        if (size == 0) {
            return -999999999;
        }
        return tail.value;
    }

    public int pop() {
        int val = tail.value;
        if (size == 1) {
            size--;
            return val;
        }


        tail = tail.next;
        tail.prev = null;


        size--;

        return val;
    }

    public int revpop() {
        int val = head.value;
        if (size == 1) {
            size--;
            return val;
        }


        head = head.prev;
        head.next = null;


        size--;

        return val;

    }

    public int middle() {
        Node node = tail;
        for (int i = 0; i < size / 2; i++) {
            node = node.next;

        }
        return node.value;

    }

    public void reverse_rec_call() {
        reverse_rec(tail);
    }

    public void reverse_rec(Node node) {
        if (size == 0) {
            return;
        }
        if (size != 0) {
            int t = pop();
            reverse_rec(tail);
            push(t);
        }


    }


    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

    }
}



