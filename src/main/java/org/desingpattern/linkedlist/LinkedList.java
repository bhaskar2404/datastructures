package org.desingpattern.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    public LinkedList(){
        this.head=null;
    }

    public void prepend(T data){
        Node<T> newNode=new Node<>(data);
            newNode.next=head;
            return;
    }

    public void append(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node<T> last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }
    public void delete(T data){

        if(head==null){
            return;
        }

        if(head.data.equals(data)){
            head=head.next;
            return;
        }
        Node<T> current=head;

        while (current.next!=null && !current.next.data.equals(data)){
            current=current.next;
        }

        if(current.next!=null){
            current.next=current.next.next;
        }
    }
    public boolean contains(T data){
        Node<T> current=head;
        while(current!=null ){
            if(current.data.equals(data)){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public int printSize(){
        Node<T> current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;

        }
        return count;
    }

    public void insert(int position, T data){
        if(position<0){
            System.out.println(" invalid Position");
        }

        if(position==0){
            prepend(data);
        }

        Node<T> newNode=new Node<>(data);
        Node<T> current=head;

        for(int i=0;i<position-1 && current!=null;i++ ){
            current=current.next;
        }
        if(current==null){
            System.out.println("Invalid position");
            return;
        }

        newNode.next=current.next;
        current.next=newNode;
    }
    public void printNodes(){
        Node<T> current=head;
        while (current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> intData=new LinkedList<>();
        intData.append(10);
        intData.append(20);
        intData.append(30);
        intData.append(40);
        intData.append(50);
        intData.append(60);

        System.out.println("Size of the nodes: "+intData.printSize());

        intData.insert(6,70);
        intData.printNodes();
        intData.delete(20);
        intData.printNodes();
    }
}
