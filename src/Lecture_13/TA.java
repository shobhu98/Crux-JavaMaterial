package Lecture_13;

public class TA implements Student,Teacher {
    @Override
    public void study() {
        System.out.println("Study like TA");
    }

    @Override
    public void play() {
        System.out.println("play like TA");

    }

    @Override
    public void job() {
        System.out.println("job like TA");

    }
}
