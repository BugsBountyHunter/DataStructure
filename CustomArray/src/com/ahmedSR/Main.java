package com.ahmedSR;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SaberArray arr = new SaberArray(3);
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.insert(60);

        System.out.println("Result: After using insert(int item)");
        arr.print();
        System.out.println("Result: After using insertAt(int index, int item)");
        arr.insertAt(2,70);
        arr.print();
        System.out.println("Result: After using removeAt(int index)");
        arr.removeAt(2);
        arr.print();
        System.out.println("Result: After using indexOf(int item)");
        System.out.println(arr.indexOf(30));
        System.out.println("Result: After using reverse()");
        arr.reverse();
        System.out.println("Result: After using max()");
        System.out.println(arr.max());
        System.out.println("Result: After using min()");
        System.out.println(arr.min());
    }
}
