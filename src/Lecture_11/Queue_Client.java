package Lecture_11;

public class Queue_Client {
    public static void main(String[] args) {
//        Lecture_11.Queue queue = new Queue();
//        for (int i = 0; i < 10; i++) {
//            int x = (int) Math.random() * 1000;
//            queue.insert(x);
//
//
//        }
//        try {
//            while (!queue.isEmpty()) {
//                System.out.println(queue.delete());
//
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            e.getStackTrace();
//        }
        Queue_Circular queue=new Queue_Circular();
        for (int i = 0; i <10 ; i++) {
            int x=(int)(Math.random()*1000);
//            System.out.println(x);
            queue.insert(x);
            queue.display();

        }
    }
}
