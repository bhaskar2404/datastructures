package org.desingpattern.doublelink;

public class DoubleNode<T> {
    T data;
    DoubleNode next;
    DoubleNode prev;

    public DoubleNode(T data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

}
