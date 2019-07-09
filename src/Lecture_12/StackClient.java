package Lecture_12;

public class StackClient {
    public static void main(String[] args) {
        DynamicStack stack=new DynamicStack();
        for (int i = 0; i <10000 ; i++) {
            stack.push(i);

        }
    //    stack.display();

    }
}
