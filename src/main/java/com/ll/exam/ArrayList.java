package com.ll.exam;

public class ArrayList {
    int[] newArr;
    int[] arr;
    int size;
    public ArrayList() {
        size = 0;
        arr = new int[2];
    }
    public Object size() {
        return size;
    }

    public void add(int data) {
        if(size >= arr.length) {
            sizeUp();
        }
        arr[size] = data;
        size++;
    }

    private void sizeUp() {
        newArr = new int[arr.length*2];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int get(int i) {
        return arr[i];
    }

    public void removeAt(int index) {
        for(int i = index; i < size; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    public int getArrayLength() {
        return arr.length;
    }
}
