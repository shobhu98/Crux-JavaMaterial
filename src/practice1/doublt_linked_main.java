package practice1;

import java.util.Scanner;

public class doublt_linked_main {
    public static void main(String[] args) {
        doublylinked_list list=new doublylinked_list();
        Scanner s=new Scanner(System.in);
        while (true){
            int t=s.nextInt();
            if(t==-1){
                break;
            }
            list.addlast(t);

        }
        int v=s.nextInt();

        list.kth_element_fromlast(v);

   //     list.displai();
    }
}



class  doublylinked_list {
    private Node head;
    private Node tail;
    private int size;

    public void addfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(size==0){
            head.prev=null;
            tail=head;

        }
        else {
            head.prev=node;
            node.prev=null;
        }
        size++;

    }
    public void addlast(int value){
        if(size==0){
            addfirst(value);
        }
        Node node =new Node(value);
        node.next=null;
        node.prev=tail;
        tail.next=node;
        tail=node;
        size++;
    }
    public void displai(){
        Node node=head;
        while (node!=null){
            System.out.println(node.value);
            node=node.next;
        }
    }
    public void kth_element_fromlast(int k){
        Node node=tail;
        for (int i = 0; i <k-1 ; i++) {
            node=node.prev;

        }
        System.out.println(node.value);
    }



    private class Node{
        private Node next;
        private Node prev;
        private int value;

        public Node(int value){
            this.value=value;
        }

    }

}

