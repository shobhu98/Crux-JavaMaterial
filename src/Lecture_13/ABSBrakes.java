package Lecture_13;

public class ABSBrakes implements Brake {
    @Override
    public void brake() {
        System.out.println("braking with abs");
    }
}
