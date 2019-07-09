package Binary_Search_tree;

public class Client {
    public static void main(String[] args) {

        int[] nums={10,20,30,40,50,60};
        BST bst=new BST(nums);
        bst.display_call();
        System.out.println(bst.find(11));

    }
}
