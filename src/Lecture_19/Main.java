package Lecture_19;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        Heap<Integer> queue=new Heap<>();
//
//        queue.insert_to_rear(7);
//        queue.insert_to_rear(6);
//        queue.insert_to_rear(5);
//        queue.insert_to_rear(4);
//        System.out.println(queue.remove());
//        queue.insert_to_rear(1);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
        Integer[] arr={3,2,45,11,111};
        HeapSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
