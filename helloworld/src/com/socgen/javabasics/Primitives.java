package com.socgen.javabasics;

public class Primitives {

    public static void main(String[] args) {
	
	// Calculator constructor
	Calculator calc = new Calculator(5, 5); 
	
	double result  = calc.multiply();
	double result1 = calc.add();
	double result2 = calc.divide();
	double result3 = calc.substract();
	
	System.out.println("multiply result: " + result);
	System.out.println("add result: " + result1);
	System.out.println("divide result: " + result2);
	System.out.println("substract result: " + result3);
	
	/* Types primitifs:
	 * 
	 * double   doubleType,
	 * int      intType,
	 * short    shortType,
	 * byte     byteType, 
	 * float    floatType,
	 * char     charType,
	 * long     longType,
	 * boolean  booleanType
	 *  
	 */
    }
    
}
