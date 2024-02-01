package org.desingpattern.linkedlist;

public class CircularLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void addNote(T data){
        Node<T> newNode=new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("No Item to display");
            return;
        }

        Node<T> current=head;
        do{
            System.out.println("Elements: "+current.data);
            current=current.next;
        }while(current!=head);

    }

    public void deleteNode(T key){
        if(head==null){
            System.out.println("No element to delete");
            return;
        }

        Node<T> current=head;
        Node<T> prevous=null;

        if(current.data==key){
            if(head.next==head){
                head=null;
                tail=null;
            }else{
                tail.next=head.next;
                head=head.next;
            }
            System.out.println("Node wit Key is  delete "+key+" Circular linked list");
            return;
        }

        do{
            if(current.data==key){
                prevous.next=current.next;

            }
            current=current.next;
        }while (current!=head);
    }

    public static void main(String[] args) {
        CircularLinkedList<String> clinked=new CircularLinkedList<>();
        clinked.addNote("First");
        clinked.addNote("{Second");
        clinked.addNote("Third");
        clinked.addNote("Four");

        clinked.display();

    }
}
