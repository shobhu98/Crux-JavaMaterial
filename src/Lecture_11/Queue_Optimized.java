package Lecture_11;

public class Queue_Optimized extends Queue{


        private  int[] data;
        private  int end;
        private int front;
        private  static  final int DEFAULT_SIZE=10;

        public Queue_Optimized() {
            this.end=-1;
            this.data=new int[DEFAULT_SIZE];
        }
        public Queue_Optimized(int size){
            this.end=-1;
            this.front=0;
            this.data=new int[size];
        }
        public boolean isEmpty(){
            return this.end<this.front;

        }
        public boolean isFull(){
            return end==this.data.length-1;
        }
        public void insert(int item){
            if(!this.isFull()){
                this.data[++this.end]=item;
            }
        }
        public int delete()throws  Exception{
            if(!this.isEmpty()){
                return  data[front++];
            }
            throw new Exception(("queue is empty"));
        }
        public void display(){
            for (int i = 0; i <= end ; i++) {
                System.out.print(data[i]+" ,");

            }
            System.out.println("End");
        }



}
