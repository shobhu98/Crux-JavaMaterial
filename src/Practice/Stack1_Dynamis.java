package Practice;

public class Stack1_Dynamis extends Stack1 {
    @Override
    public void push(int item){
        if(isFull()){
            int[] temp=new int[data.length*2];
            for (int i = 0; i <data.length ; i++) {
                temp[i]=data[i];
            }
            data=temp;
            super.push(item);
        }
    }
}
