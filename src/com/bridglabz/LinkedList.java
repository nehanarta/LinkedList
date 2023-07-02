package com.bridglabz;

public class LinkedList {
    Node head;
    Node tail;
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void append(int data) {
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else
        tail.next=newNode;
        tail=newNode;
    }
    public void firstElementDelete() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        }
        head = head.next;
    }


    public void display() {
        Node currentNode=head;
        if (currentNode==null){
            System.out.println("Linked list is empty");
        }
        while (currentNode !=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }
}
