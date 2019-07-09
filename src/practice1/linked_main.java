package practice1;

import lecture_7.N;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class linked_main {
    public static void main(String[] args) throws Exception{

        Scanner s=new Scanner(System.in);
     //  int t=s.nextInt();

            int t=s.nextInt();
            linked list=new linked();
        for (int i = 0; i <t ; i++) {
            list.Insertlast(s.nextInt());

        }
        //list.rec_reverse(t);
        list.mergesort_client_facing();
        list.Display();


      //  list.reverse();
      //  list.recursivesort(s1-1,0,s1);
        //list.sort();
      //  int w=s.nextInt();
       // list.linkedlist_k_append(s1-w-1,s1);
     //   list.bubblesort_recursive(s1,0,0);
     //   list.insertion_sort();
      //  list.Display();

//   int x=   Math.abs(s1-s2);
//        int max=Math.max(s1,s2);
//        System.out.println(list1);
//        System.out.println(list2);
//        for (int i = 0; i <max ; i++) {
//            int t1=list1.get(i+x);
//            int t2=list2.get(i);
//            if(t1==t2){
//                System.out.println(t1);
//                tx=false;
//                break;
//            }
//
//        }
//        if(tx==true){
//            System.out.println(-1);
//        }






    }
}


 class linked {
    private Node head;
    private Node tail;
    private int size;

    public void Insertfirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void Insertlast(int value){
        if(size==0){
            Insertfirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;

    }
    public int  Deletefirst()throws Exception{
        if(size==0){
            throw new Exception("Removing from empty list");
        }
        int value=head.value;
        head=head.next;
        if(size==1){
            head=null;
            tail=null;
        }
        size--;
        return value;

    }
    public int Deletelast()throws Exception{
        if(size<2){
            Deletefirst();

        }
        int value=tail.value;
        Node node=head;
        while(node.next!=tail){
            node=node.next;
        }
        node.next=null;
        tail=node;
        size--;
        return value;

    }
    public Node Getnode(int index)throws Exception{
        if(index<0||index>size){
            throw new Exception("out of bounds");
        }
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;

        }
        return node;
    }
    public void Insert(int index,int value)throws Exception{
        if(index==0){
            Insertfirst(value);
        }
        if(index==size){
            Insertlast(value);
        }
        Node prev=Getnode(index-1);
        Node node=new Node(value);
        node.next=prev.next;
        prev.next=node;
        size++;

    }
    public void Delete(int index)throws Exception{
        if(index==0){
            Deletefirst();
            return;
        }
        if(index==size-1){
            Deletelast();
            return;
        }
        Node prev=Getnode(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        //  return value;

    }
    public void Display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value+" ");
            node=node.next;
        }

        // System.out.println("END");
    }
    public void sort(){
        for (int i = 0; i <size-1 ; i++) {
            Node currentnode=head;
            Node next=head.next;
            for (int j = 0; j <size-i-1 ; j++) {
                if(currentnode.value>next.value){
                    int temp=currentnode.value;
                    currentnode.value=next.value;
                    next.value=temp;

                }
                currentnode=next;
                next=next.next;
            }

        }


    }
    public void reverse(){
        Node prev=head ;
        Node cur=head.next;
        Node latest=head.next.next;
        while (latest!=null){
            cur.next=prev;
            prev=cur;
            cur=latest;
            latest=latest.next;

            //cur=prev.next;


        }
        if (latest==null){
            cur.next=prev;
        }
        head.next=null;
        head=cur;
    }
    public void rec_reverse(int i){
        Node curr=head;
        Node last;
        if(i==-1){
            curr.next=null;
            head=tail;
            return;
        }

        for (int j = 0; j <i-2 ; j++) {
            curr=curr.next;

        }
        last=curr.next;
        last.next=curr;
        rec_reverse(i-1);

    }
    public void recursivesort(int i,int  st,int size){
        if(st<size/2){
            Node current=head;
            Node latest=head;
            for (int j = 0; j <size-i-1 ; j++) {
                current=current.next;

            }
            for (int j = 0; j <i ; j++) {
                latest=latest.next;

            }
            int temp=current.value;
            current.value=latest.value;
            latest.value=temp;
            recursivesort(i-1,st+1,size);
        }

    }
    public void linkedlist_k_append(int s,int size) {

        if (s > 0) {
            Node node = head;
            Node current;
            for (int i = 0; i < s; i++) {
                node = node.next;


            }
            current = node.next;
            node.next = null;
            tail.next = head;
            head = current;

        }
        if (s <= 0) {
            return;
        }



        }

    public void kth_ekement_fromlast(int size){
        Node node=head;
        for (int i = 0; i <size ; i++) {
            node=node.next;

        }
        System.out.println(node.value);
    }
    public void bubblesort_recursive(int row,int col,int i){
        Node node=head;
        for (int j = 0; j <i ; j++) {
            node=node.next;

        }
        if(row==0){
            return;
        }
        if(row==col){
            bubblesort_recursive(row-1,0,0);
            return;
        }
        if(node.next==null){
            bubblesort_recursive(row-1,0,0);
            return;
        }
        if(node.value>node.next.value){
            int temp=node.value;
            node.value=node.next.value;
            node.next.value=temp;
        }

        bubblesort_recursive(row,col+1,i+1);
    }
    public void insertion_sort(){

        for (int i = 0; i <size-1 ; i++) {
            //Node  node=head;
            Node current=head;
            Node max=head;
            for (int j = 0; j <size-i-1 ; j++) {
                if(max.value<current.value){
                    max=current;

                }
                current=current.next;



            }
            if(current.value<max.value){
                int t=current.value;
                current.value=max.value;
                max.value=t;


            }







        }
    }
//     public int getLength(Node a) {
//         int count = 0;
//         Node h = a;
//         while (h != null) {
//             count++;
//             h = h.next;
//         }
//         return count;
//     }
     public void mergesort_client_facing(){
        mergesort(head);


     }
Node getMiddle(Node h)
{
    //Base case
    if (h == null)
        return h;
    Node fastptr = h.next;
    Node slowptr = h;

    // Move fastptr by two and slow ptr by one
    // Finally slowptr will point to middle node
    while (fastptr != null)
    {
        fastptr = fastptr.next;
        if(fastptr!=null)
        {
            slowptr = slowptr.next;
            fastptr=fastptr.next;
        }
    }
    return slowptr;
}
     //    private  Node mergesort(Node a){
//        Node oldhead=a;
//        int mid=getLength(oldhead)/2;
//
//        if(a.next==null){
//            return oldhead;
//        }
//        while (mid - 1 > 0) {
//            oldhead = oldhead.next;
//            mid--;
//        }
//        Node newhead=oldhead.next;
//        oldhead.next=null;
//        oldhead=head;
//        Node t1 =mergesort(oldhead);
//        Node t2=mergesort(newhead);
//        return MergeList(t1,t2);
//
//    }
public Node mergesort(Node a) {
    Node oldHead = a;
    // find the length of the linkedlist
    Node mid = getMiddle(oldHead);
    if (a.next == null){
        return a;
    }

    // set one pointer to the beginning of the list and another at the next
    // element after mid
//    while (mid - 1 > 0) {
//        oldHead = oldHead.next;
//        mid--;
//    }

    Node newHead = mid.next;
    mid.next=null;

  //  oldHead.next = null;
    oldHead = a;

    Node t1 = mergesort(oldHead);
    Node t2 = mergesort(newHead);
    return MergeList(t1, t2);
}
     public Node MergeList(Node a, Node b) {
         Node result = null;
         if (a == null)
             return b;
         if (b == null)
             return a;
         if (a.value > b.value) {
             result = b;
             Node x=MergeList(a, b.next);
             result.next = x;
         } else {
             result = a;
             Node x=MergeList(a.next, b);
             result.next = x;
         }
         return result;
     }
    public int get(int index){
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;

        }
        return node.value;
    }



    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;

        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }


}

