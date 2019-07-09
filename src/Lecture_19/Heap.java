package Lecture_19;

import java.util.ArrayList;

public class Heap<T extends  Comparable<T>> {

    private ArrayList<T> data;

    public Heap(){
        data=new ArrayList<>();
    }

    public int parent(int index){
        return (index-1)/2;
    }
    public int left(int index){
        return (index*2)+1;
    }
    public int right(int index){
        return (index*2)+2;
    }
    public void add(T value){
        data.add(value);
        upheap(data.size()-1);
    }

    private void upheap(int index) {
        while (index <= 0) {
            return;
        }
        int parent = parent(index);
        if (data.get(parent).compareTo(data.get(index)) > 0) {
            T temp=data.get(parent);
            data.set(parent,data.get(index));
            data.set(index,temp);
            upheap(parent);
        }

    }
    public T remove(){
        T first=data.get(0);
        T last=data.remove(data.size()-1);
        if(data.size()>0){
            data.set(0,last);
            downheap(0);
        }
        return first;

    }
    private void downheap(int index){

        int left = left(index);
        int right = right(index);

        int min = index;

        if (left < data.size() && data.get(left).compareTo(data.get(min)) < 0){
            min = left;
        }

        if (right < data.size() && data.get(right).compareTo(data.get(min)) < 0){
            min = right;
        }
        if(index==min){
            return;
        }
        T temp=data.get(min);
        data.set(min,data.get(index));
        data.set(index,temp);
        downheap(min);



    }

    }



