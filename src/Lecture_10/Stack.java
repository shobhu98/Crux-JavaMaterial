package Lecture_10;

public class Stack {
    protected int[] data;
    private int top;
    private final static int DEFAULT_CAPACITY=10;
    public Stack(){
        this.data=new int[DEFAULT_CAPACITY];
        top=-1;
    }
    public Stack(int size){
        this.data=new int[size];
        top=-1;
    }
    public boolean isEmpty(){
        return  top==-1;
    }
    public boolean isFull(){
        return top==data.length-1;
    }
    public void push(int item){
        if(!isFull()){
            top++;
            data[top]=item;
        }
        else{
            System.out.println("Stack is already full");
        }

    }
    public int pop() throws Exception{
        if(!this.isEmpty()){
            return this.data[top--];
        }
        throw new Exception("Bhaag yaha se");
    }
    public void display(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(data[i]+" ,");

        }
        System.out.println("End");
    }

}
