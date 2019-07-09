package Lecture_11;

public class Client {
    public static void main(String[] args) {
        Wonder_car myCar = new Wonder_car();

//
//        for (int i = 0; i < 9; i++) {
//            myCar.start();
//
//            myCar.stop();
//        }

        Engine engine = new Engine_Petrol();

        engine = new Engine_Nitro();

    }
}
