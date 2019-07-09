package Practice;

import lecture_7.N;
import org.w3c.dom.Node;

import javax.management.StringValueExp;
public class Linked_list{

    private Node head;
    private Node tail;
    private int size;

    public void   insertFirst(String value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if (size==0){
            tail=head;
        }
        size++;


    }
    public void insertLast(String value){
        if(size==0){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;

    }
    public void deleteFirst()throws Exception{
        if (size==0){
            throw new Exception("list is empty");

        }
        String value= head.value;
        head=head.next;
        if(head==null){
            tail=head;
        }
        size--;

    }
    public String deleteLast()throws Exception{
        if(size<2){
            deleteFirst();
        }
        Node node=head;
        while (node.next!=null){
            node=node.next;
        }
        String value=tail.value;
        node.next=null;
        tail=node;
        size--;
        return value;
    }
    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value+',');
            node=node.next;
        }
        System.out.println("end \b");
    }
    public Node getNode(int index)throws Exception{
        if(index<0||index>size){
            throw  new Exception("index out of bound");
        }
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;

        }
        return node;
    }
    public void insert(int index,String value)throws Exception{
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node prev=getNode(index-1);
        Node node=new Node(value);
        node.next=prev.next;
        prev.next=node;
        size++;
    }


    private class Node{
        private String value;
        private Node next;
        private Node(String value){
            this.value=value;
        }
        private Node(String value,Node next){
            this.value=value;
            this.next=next;
        }
    }


}
