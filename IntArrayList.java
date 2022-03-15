package com.akadatsky;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] arr = new int[10];
    private int size = 0;

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
            return true;
        }
        if (size < index) {
            System.out.println("ошибка");
        }

        return false;
    }

    @Override
    public void clear() {
    size = 0;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean removeByValue(int value) {
        return false;
    }

    @Override
    public boolean set(int index, int element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

}
