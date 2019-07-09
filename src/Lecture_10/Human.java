package Lecture_10;

public class Human {
    int[] nums=new int[10000];
    public static int id_generator=0;
    public final int id;
    public int eyes;

    public String name;
    public int balance=1000;
    public static int population;
    public Human(){
        this.id=id_generator++;
        population+=1;
        System.out.println("one is born"+population);
    }

    public void smile(){
        System.out.println("See I got a great smile");


    }
    public Human(int eyes){
        this.id=id_generator++;
        this.eyes=2;
    }
    public void eat(){
        balance=balance-100;
    }
    public static void genesis(){
        population=0;

    }


    protected void finalize() throws Throwable {
        population--;
        System.out.println("one is dead "+population);

    }
}
