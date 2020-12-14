package com.ahmedSR;

public class SaberArray {
    private int count = 0;
    private int [] items;

    public SaberArray(int length){
        items = new int[length];
    }

    //add ( insert)
    public void insert(int item){
        if( count == items.length){

            int[] newItems = new int[count * 2];

            for(int i = 0; i<count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
        items[count++] = item;
    }

    //insertAt
    public void insertAt(int index, int item){
        if(index < 0 || index > count){
            throw new IllegalArgumentException();
        }
        //check if items array is full.
        if(count == items.length){
            int[] newItems = new int[count * 2];

            for(int i = 0; i<count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        int [] newItems = new int[count + 1];

        for(int i = 0; i < count; i++)
            newItems[i] = items[i];

        newItems[index] = item;

        for(int i = index; i < count; i++){
            newItems[i + 1] = items[i];
        }

        items = newItems;
        count++;
    }

    //removeAt
    public void removeAt(int index){

        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        int [] tempItems = new int[count];

        for(int i = 0; i < count; i++)
            tempItems[i] = items[i];

        for(int i = index; i < count - 1; i++){
            tempItems[i] = items[i + 1];
        }

        items = tempItems;
        count--;
    }
    public int indexOf(int item){
        for(int i = 0; i < count; i++){
            if(item == items[i])
                return i;
        }
        return -1; // mean item not founded or anything else.
    }
    //max
    public int max(){
        int max = items[0];
        for(int item : items){
            if(item > max)
                max = item;
        }
        return max;
    }
    //min
    public int min(){
        int min = items[0];

        for (int item :  items){
            if(item < min)
                min = item;
        }
        return min;
    }
    //reverse
    public void reverse(){
        for(int i = count; i > 0; i--)
            System.out.println(items[i]);
    }
    //printAll
    public void print(){
        for(int i = 0; i < count ; i++)
            System.out.println(items[i]);
    }
}
