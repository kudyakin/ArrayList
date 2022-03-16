package com.akadatsky;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] arr = new int[10];
    private int size = 0;
    private int lastFullElement = 0;

    public void trimToSize(){
        this.size = lastFullElement;
        int[] tempArr =  new int[lastFullElement];
        System.arraycopy(arr, 0, tempArr, 0, tempArr.length);
        this.arr = tempArr;
    }

    @Override
    public void add(int element) {
        if (size >= arr.length) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = element;
        size++;
        lastFullElement++;
    }

    @Override
    public boolean add(int index, int element) {
        if (size >= index) {
            int[] newArr = new int[size + 1];
            int oldElement = arr[index];
            for (int i = index + 2; i < size + 1; i++) {
                newArr[i] = arr[i - 1];
            }
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = element;
            newArr[index + 1] = oldElement;
            arr = newArr;
            size++;
            lastFullElement++;
            return true;
        }
        if (size < index) {
            System.out.println("Ошибка добавления");
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(arr, 0);
        lastFullElement = 0;
    }

    @Override
    public int get(int index) {
        if(index > this.lastFullElement){
            System.out.println("Нет такого элемента");
        }
        return arr[index];
    }

    @Override
    public boolean isEmpty() {
        return lastFullElement == 0;
    }

    @Override
    public boolean remove(int index) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < lastFullElement - 1; i++){
            if(i < index){ temp[i] = arr[i]; }
            else if(i == index){ temp[i] = arr[i + 1]; }
            else { temp[i] = arr[i + 1]; }
        }
        arr = temp;
        lastFullElement--;
        trimToSize();
        return true;
    }

    @Override
    public boolean removeByValue(int value) {
        for (int i = 0; i < this.arr.length; i++){
            if(arr[i] == value){
                remove(i);
            }
        }
        return true;
    }

    @Override
    public boolean set(int index, int element) {
        if(index > this.lastFullElement){
            System.out.println("Нет такого элемента");
            return false;
        }
        else{
            arr[index] = element;
        }
        return true;
    }

    @Override
    public int size() {
        return lastFullElement;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        IntArrayList subList = new IntArrayList();
        if(fromIndex <= lastFullElement && toIndex <= lastFullElement){
            for(int i = 0; i < arr.length; i++){
                if(i >= fromIndex && i <= toIndex){
                    subList.add(arr[i]);
                }
            }
        }
        else{
            System.out.println("Не корретные индексы");
        }
        return subList;
    }

    @Override
    public int[] toArray() {
        int[] array = new int[lastFullElement];
        System.arraycopy(arr, 0, array, 0, array.length);
        return array;
    }

    @Override
    public String toString() {
        int[] arrToString = new int[lastFullElement];
        System.arraycopy(arr, 0, arrToString, 0, arrToString.length);
        return Arrays.toString(arrToString);
    }
}