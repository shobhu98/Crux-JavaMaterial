package Lecture_11;

public class Wonder_car extends Car {
    public int engines;
    public int windows;
    public void  start(){
        super.start();
        System.out.println("Start With Extra Noise");
    }
    public Wonder_car(){
        this.engines=2;
        this.windows=2;
    }

}
