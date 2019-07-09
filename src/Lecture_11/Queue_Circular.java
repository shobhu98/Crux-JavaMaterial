package Lecture_11;

public class Queue_Circular extends Queue {


        protected int[] data;
        protected   int end;
        protected int front;
        private int size;
        private  static  final int DEFAULT_SIZE=10;

        public Queue_Circular() {
            this.end=-1;
            this.size=0;
            this.data=new int[DEFAULT_SIZE];
        }
        public Queue_Circular(int size){
            this.end=-1;
            this.size=0;
            this.front=0;
            this.data=new int[size];
        }
        public boolean isEmpty(){
            return size==0;

        }
        public boolean isFull(){
            return size==data.length;
        }
        public void insert(int item){
            if(!this.isFull()){
                this.end=(this.end+1)%this.data.length;
                this.data[this.end]=item;
                size++;
            }
        }
        public int delete()throws  Exception{
            if(!this.isEmpty()){
                int val=this.data[front];
                this.front=(this.front+1)%this.data.length;
                size--;
                return val;
            }
            throw new Exception(("queue is empty"));
        }
        public void display(){
            for (int i = 0; i <front+size ; i++) {
                System.out.print(data[i%data.length]+" ,");

            }
            System.out.println("End");
        }



}
