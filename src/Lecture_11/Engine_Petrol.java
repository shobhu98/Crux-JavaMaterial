package Lecture_11;

public class Engine_Petrol extends Engine {
    public int rpm=0;
    public void start(){
        if (cycles > 7){
            System.out.println("Can not start");
            return;
        }
        System.out.println("Start like Petrol engine");
        cycles++;
    }
    public void start(int rpm){
        this.rpm=rpm;
        System.out.println("Starting with rpm"+rpm);
    }

    public void stop(){
        System.out.println("Stop like Petrol engine");
    }
}
