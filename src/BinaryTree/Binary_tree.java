package BinaryTree;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Scanner;

public class Binary_tree {
    private Node root;
    private int size;
    Binary_tree(){
        Scanner s=new Scanner(System.in);
        root=takeInput(s,null,false);


    }
    private Node takeInput(Scanner s,Node parent,boolean isLeftorRight){

        if(parent==null){
            System.out.println("enter the value for root node");

        }
        else{
            if(isLeftorRight){
                System.out.println("enter the value  of left child of"+parent.value);
            }
            else {
                System.out.println("enter the value  of right child of"+parent.value);
            }

        }
        int nodeData=s.nextInt();
        Node node=new Node(nodeData,null,null);
        size++;
        boolean choice=false;
        System.out.println("do you have left node of true/false"+node.value);
        choice=s.nextBoolean();
        if(choice){
            node.left=takeInput(s,node,true);
        }

        choice=false;
        System.out.println("do you have right node of true/false"+node.value);
        choice=s.nextBoolean();
        if(choice){
            node.right=takeInput(s,node,false);
        }
        return node;
    }
    private class Node{
        private Node left;
        private Node right;
        private int value;
        public Node(int value,Node left,Node right){
            this.value=value;
            this.left=left;
            this.right=right;


        }
    }
    public void displaycall(){
        display(root);


    }
   private void display(Node node){
        String str="";

        if(node.left!=null){
            str=str+node.left.value+"=>";
        }
        else {
            str=str+"END=>";
        }
        str=str+node.value;
        if(node.right!=null){
            str=str+"<="+node.right.value;
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
    public void preorder(){
        preordercall(root)
        ;

    }
    private void preordercall(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+",");
        preordercall(node.left);
        preordercall(node.right);

    }


    public void postorder(){
        postorder(root);

    }
    private void postorder(Node node){
        if(node==null){
            return;
        }

        postorder(node.left);

        postorder(node.right);
        System.out.println(node.value+",");

    }
    public void levelorder(){
        levelOrder(root);
    }

    private void levelOrder(Node node){
        LinkedList<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node rv=queue.removeFirst();
            System.out.println(rv.value+",");
            if(rv.left!=null){
                queue.addLast(rv.left);
            }
            if(rv.right!=null){
                queue.addLast(rv.right);
            }

        }

    }
}


