package com.bridglabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList Ls=new LinkedList();
        Ls.add(30);
        Ls.add(56);
        Ls.add(70);
        Ls.display();
        LinkedList Ls1=new LinkedList();
        Ls1.append(56);
        Ls1.append(30);
        Ls1.append(70);
        Ls1.display();
        Ls1.firstElementDelete();
        Ls1.display();
        Ls1.lastElementDelete();
        Ls1.display();



    }
}
