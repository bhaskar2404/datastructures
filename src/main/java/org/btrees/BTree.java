package org.btrees;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {
    Node root;
    public BTree(){
        root=null;
    }

    void insert(int data){
        root=inserRecord(root,data);
    }

    private Node inserRecord(Node root, int data) {
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){
            root.left=inserRecord(root.left,data);
        }else if(data>root.data){
            root.right=inserRecord(root.right,data);
        }
        return root;
    }

    public void inoderTraversal(Node root){
        if(root!=null){
            inoderTraversal(root.left);
            System.out.print(root.data+" ");
            inoderTraversal(root.right);
        }
    }

    public void preOderTraversal(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOderTraversal(root.left);
            preOderTraversal(root.right);
        }
    }
    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public void leveOrder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> queue= new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node current=queue.poll();
            System.out.print(current.data+" ");
            if (current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BTree btree=new BTree();
        btree.insert(50);
        btree.insert(30);
        btree.insert(20);
        btree.insert(40);
        btree.insert(70);
        btree.insert(60);
        btree.insert(80);
        System.out.println("In order traversing btree");
        btree.inoderTraversal(btree.root);
        System.out.println("Pre order traversing");
        btree.preOderTraversal(btree.root);
        System.out.println("Post order traversing");
        btree.postOrder(btree.root);
        System.out.println("Level Order");
        btree.leveOrder(btree.root);
    }
}
