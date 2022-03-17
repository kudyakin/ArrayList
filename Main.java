package com.akadatsky;

public class Main {

    public static void main(String[] args) {

        IntArrayList myList = new IntArrayList();

        System.out.println("Добавляю в список элементы");
            myList.add(4);
            myList.add(75);
            myList.add(13);
            myList.add(84);
            myList.add(30);
            myList.add(41);
            myList.add(89);

        System.out.println(myList);

        System.out.println("Добавляю в список элементы по индексу");
        myList.add(3,777);
        myList.add(5,65);
        myList.add(64,88888);
        System.out.println(myList);

        System.out.println("Вывожу 4 элемент списка - " + myList.get(4));

        System.out.println("Список пуст? - " + myList.isEmpty());

        System.out.println("Удаляю 4 элемент списка - " + myList.remove(4));

        System.out.println("Удаляю элемент списка со значением 13 - " + myList.removeByValue(13));

        System.out.println("Устанавливаю элемент 38 в 3 индексе - " + myList.set(3, 38));
        System.out.println(myList);

        System.out.println("Сейчас размер списка - " + myList.size());

        System.out.println("Вывожу с 3 по 5 элементы в отдельный список - " + myList.subList(3, 5));

        System.out.println("Вывожу список в виде строки - " + myList.toString());

        System.out.println("Очищаю список и вывожу его");
        myList.clear();
        System.out.println(myList);
    }
}