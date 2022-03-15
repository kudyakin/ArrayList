package com.akadatsky;


public class Main {

    public static void main(String[] args) {

        //IntList myList2 = new IntLinkedList();
        IntArrayList myList = new IntArrayList();

//        for (int i = 0; i < 10; i++) {
            myList.add(4);
            myList.add(75);
            myList.add(13);
            myList.add(84);
            myList.add(30);
        System.out.println("---------");
            myList.add(41);
            myList.add(89);
            myList.add(13);
            myList.add(13);
            myList.add(13);
//        }

        System.out.println(myList);
//        myList.clear();
//        System.out.println(myList);

        myList.add(3,777);
        myList.add(5,65);
        myList.add(64,88888);
        System.out.println(myList);

    }

}