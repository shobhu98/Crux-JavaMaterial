package Lecture_10;

public class Client {
    public static void main(String[] args) {
        Human shobhit=new Human();

     //   System.out.println(shobhit.population);
        System.out.println(Human.population);

        shobhit.name="Shobhit Tiwari";
       // System.out.println(shobhit.name);
      //  shobhit.smile();
        System.out.println(shobhit.balance);
        shobhit.eat();
        System.out.println(shobhit.balance);
       final Human syed=new Human();
     //  syed=new Human();
        for (int i = 0; i <10000; i++) {
            Human t=new Human();

        }
    }

}
