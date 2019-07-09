package Lecture_13;

import java.util.Stack;


        public  class QueueUsingStackInsert {
            private Stack<Integer> stack=new Stack<>();
            public void insert(int item){

            }
            public int remove(){
                Stack<Integer> extra=new Stack<>();

                while (!stack.empty()){
                    extra.push(extra.pop());
                }
                int val=extra.pop();
                return val;


            }
            public boolean isEmpty(){
                return stack.isEmpty();
            }

        }
