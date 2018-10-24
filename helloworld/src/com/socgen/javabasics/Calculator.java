package com.socgen.javabasics;

/**
 * This class provides. Detailed description
 * 
 * @author Richard Phonthibsvads
 */

public class Calculator {

    /**
     * Instance variables.
     * 
     */

    // Instance variables
    private double a;
    private double b;

    /**
     * 
     * This constructor takes 2 parameters a & b type double
     * 
     * @param a operand a
     * @param b operand b
     */

    public Calculator(double a, double b) {
	// keyword 'this' refers to the instance
	this.a = a;
	this.b = b;
    }

    /**
     * 
     * This method provides.
     * 
     * add method
     * 
     * @return a + b
     * 
     *         substract method
     * @return a - b
     * 
     *         divide method
     * @return a / b
     * 
     *         multiply method
     * @return a * b
     * 
     */

    public double add() {
	return a + b;
    }

    public double substract() {
	return a - b;
    }

    public double divide() {
	return a / b;
    }

    public double multiply() {
	return a * b;
    }

}
