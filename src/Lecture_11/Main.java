package Lecture_11;

public class Main {
    public static void main(String[] args) {
        Human anubhav=new Human("Anu Bhav");
      //  anubhav.name="Anu Bhav";
    //    System.out.println(anubhav.getName());
        anubhav.addPet("Bhola","Labra",3);
        System.out.println(anubhav.getPets());
        anubhav.eat();


    }
}
