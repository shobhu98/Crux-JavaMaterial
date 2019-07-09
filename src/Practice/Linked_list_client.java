package Practice;

public class Linked_list_client {
    public static void main(String[] args)throws Exception {
        Linked_list list = new Linked_list();
        list.insertFirst("Shobhit");
        list.insertLast("vinayak");
        list.insertLast("Dev");
        list.insert(2,"Akash");
        list.display();

    }



}
