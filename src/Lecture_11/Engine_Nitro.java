package Lecture_11;

public class Engine_Nitro extends Engine{
    public int cycles = 0;

    public void start(){

        System.out.println("Start like normal engine");
        cycles++;
    }

    public void stop(){
        System.out.println("Stop like normal engine");
    }
}
