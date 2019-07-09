package queue;

import org.w3c.dom.Node;

import java.util.Scanner;

public class queuemain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        int test=s.nextInt();

        for (int j = 0; j <test ; j++) {
            int[] t=new int[2];
            for (int i = 0; i <2 ; i++) {
                t[i]=s.nextInt();

            }
            queue queue=new queue();
            for (int i = 0; i <t[0] ; i++) {
                queue.enqueue(s.nextInt());
            }
            queue.reverse_first_k(t[1]-1,0,t[0]);
            queue.finale(t[0]-t[1],0);


           queue.display();
        }




    }
}


class queue  {
    private Node head;
    private Node tail;
    private int size;

    public void enqueue(int value){
        Node node=new Node(value);

        if(size==0){
            head=node;
            tail=node;


        }
        else {
            tail.next=node;
            tail=node;
        }

        size++;

    }
    public int dequeue(){
        int data=head.value;
        head=head.next;
        size--;
        return data;

    }

    public void reverse(){
        if(size==0){
            return;
        }
        int data=dequeue();
        reverse();
        enqueue(data);

    }
    public  void sort(int t){




        for (int i = 0; i <size ; i++) {
            int min=999999999;
            int min_index=0;
            Node node=head;

            for (int j = 0; j <size-i ; j++) {
                if(node.value<min){
                    min=node.value;
                    min_index=j;
                }
                node=node.next;



        }
       //     System.out.println("min"+min_index);

           insert_to_rear(min_index,0,t);
           // display();




        }

    }
    public void add_first(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        size++;
    }
    public  void insert_to_rear(int index, int i,int t){
        if(size==0){
            return;
        }
       // Node node=head;
        if(index!=i){
            int d= dequeue();
            insert_to_rear(index,i+1,t);
            enqueue(d);

        }
        if(index==i){
            int d=dequeue();
            enqueue(d);

            return;

        }
        if(size==t){
            shift(size-index,0);
        }

    }
    public void shift(int in,int i){
        for (int j = 0; j <in ; j++) {
            int d=dequeue();
            enqueue(d);


        }
        return;
    }
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.value+" ");

            node=node.next;
        }
        System.out.println();
    }
    public void reverse_first_k(int index,int i,int t){

        if(index!=i){
            int d=dequeue();
            reverse_first_k(index,i+1,t);
            enqueue(d);
            return;
        }
        if(index==i){
            enqueue(dequeue());
            return;
        }
    }
    public void finale(int index,int i){
        if(i<index){
            enqueue(dequeue());
            finale(index,i+1);
        }

    }











    private class Node{
        private Node next;
        private Node prev;
        private int value;
        public Node(int value){
            this.value=value;
        }
        public Node (int value,Node node){
            this.value=value;
            this.next=next;
        }


    }
}

