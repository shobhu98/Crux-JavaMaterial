package Practice;

import Lecture_10.Stack;

public class Stack1 {
    protected int[] data;
    private int top;
    private final  static int Default_Capacity=10;
    public Stack1(){
        this.data=new int[Default_Capacity];
        top=-1;

    }
    public Stack1(int size){
        this.data=new int[size];
        top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==data.length-1;
    }
    public void push(int item){
        if(!isFull()){
            top++;
            data[top]=item;
        }
        else {
            System.out.println("Stack is already full");
        }

    }
    public int pop()throws Exception{
        if(!isEmpty()){
            return data[top--];

        }
        throw new Exception("Stack is empty");
    }
    public void display(){
        for (int i = 0; i <=top ; i++) {
            System.out.print(data[i]+",");

        }
        System.out.println("\b end");

    }
}
