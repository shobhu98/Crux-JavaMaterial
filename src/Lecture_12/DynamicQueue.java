package Lecture_12;

import Lecture_11.Queue;
import Lecture_11.Queue_Circular;

public class DynamicQueue extends Queue_Circular {
    @Override
    public void insert(int item) {
        if(isFull()){
            int[] temp= new int[data.length*2];
            for (int i = 0; i <data.length ; i++) {
                temp[i]=data[(front+i)%data.length];

            }
            front=0;
            end=data.length-1;
            data=temp;

        }
        super.insert(item);

    }
}
