package Binary_Search_tree;

import BinaryTree.Binary_tree;
import org.w3c.dom.Node;

public class BST {

    private class Node{
        private Node left;
        private Node right;
        private  int val;


    }
    private Node root;

    public BST(int[] arr){
        this.root=construct(arr,0,arr.length-1);
    }

    private Node construct(int[] arr,int low,int high){
        if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        int d=arr[mid];
        Node node=new Node();
        node.val=d;
        node.left=construct(arr,low,mid-1);
        node.right=construct(arr,mid+1,high);
        return  node;

    }
    public void display_call(){
        display(root);
    }

    private void display(Node node){
        String str="";

        if(node.left!=null){
            str=str+node.left.val+"=>";
        }
        else {
            str=str+"END=>";
        }
        str=str+node.val;
        if(node.right!=null){
            str=str+"<="+node.right.val;
        }
        else {
            str=str+"<=END";
        }
        System.out.println(str);
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }

    }
    public boolean find(int item) {
        return finding(root,item);


    }
    private boolean finding(Node node,int item){
        if(node==null){
            return false;
        }
        if(item>node.val){
          return   finding(node.right,item);
        }
        else if(item<node.val){
        return     finding(node.left,item);
        }


          return true;

    }
}
