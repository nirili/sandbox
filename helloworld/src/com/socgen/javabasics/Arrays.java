package com.socgen.javabasics;

public class Arrays {

    public static void main(String[] args) {

	int[] ints = new int[10];
	ints[3] = 5;
	System.out.println(ints.length);
	System.out.println(ints[3]);

	boolean[] bool = new boolean[10];
	System.out.println("boolean value before: " + bool[3]);
	bool[3] = true;
	System.out.println("boolean value after: " + bool[3]);

	System.out.println("======== Iterate over booleans array ========");
	for (int i = 0; i < bool.length; i++) {
	    System.out.println("index = " + i + " value = " + bool[i]);
	}

	int index = 0;
	for (int i : ints) {
	    System.out.println("index = " + index + ", value = " + i);
	    index++;
	}

	int[] test = new int[10];
	System.out.println("======== ASC ========");
	for (int i = 0; i < test.length; i++) {
	    test[i] = i;
	    System.out.println(test[i]);
	}

	System.out.println("======== DESC ========");
	for (int j = test.length - 1; j >= 0; j--) {
	    test[j] = j;
	    System.out.println(test[j]);
	}

	String str = "LISSANDRE";
	char[] firstName = str.toCharArray();

	System.out.println("======== Change Letter ========");
	for (int i = 0; i < firstName.length; i++) {
	    System.out.println(firstName[i]);
	}

	firstName[0] = 'R';
	firstName[8] = 'Z';

	System.out.println("======== Reverse ========");
	for (int j = firstName.length - 1; j >= 0; j--) {
	    test[j] = j;
	    System.out.print(firstName[j] + " ");
	}

    }

}
