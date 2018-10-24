package com.socgen.javabasics;

public class Strings {

    public static void main(String[] args) {
	// Concatenation
	String hello = "Hello ";
	String world = "World";
	String warcraft = " of Warcraft !";
	String helloWorld = hello + world + warcraft;

	System.out.println(helloWorld + " length = " + helloWorld.length());
	System.out.println(helloWorld.toUpperCase());
	System.out.println(helloWorld.toLowerCase());

    }

}
