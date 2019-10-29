/*
 * Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 *
 * @Author: Aarav Navani
 * period: 3
 */
import java.lang.Math;

public class Fraction {
	//instance variables
	private int num;
	private int denom;
	
	//Default Constructor initializing numerator and denominator equal to 0
	public Fraction() {
		num = 0;
		denom = 1;
	}
	//Parametrized constructor with an int parameter that initializes the numerator to the parameter. 
	public Fraction(int n) {
		num = n;
		denom = 1;
	}
	//Parametrized constructor with 2 int parameters that initializes both the numerator and the denominator to the parameters.
	public Fraction(int n, int d) {
		num = n;
		denom = d;
	    reduce();
	}
	//Parametrized constructor which creates a copy of the given fraction, other
	public Fraction(Fraction other) {
	   this.num = other.num;
	   this.denom = other.denom;
	   reduce();
	}
	//getter method to get the numerator
	public int getNumerator() {
		return num;
	}
	//getter method to get the denominator
	public int getDenominator() {
		return denom;
	}
	//getter method to get the double value of the fraction
	public double getValue() {
		return ((double)num/denom);
	}
	//setter method for the numerator
	public void setNumerator(int n) {
		num = n;
		reduce();
	}
	//setter method for the denominator
	public void setDenominator(int d) {
		denom = d;
		reduce();
	}
	//setter method to copy the given fraction other
	public void setFraction(Fraction other) {
		this.num = other.num;
		this.denom = other.denom;
		reduce();
	}
	//Returns a Fraction object that is the sum of this fraction and other
	public Fraction add(Fraction other) {
		int myNum = (this.num * other.denom + other.num * this.denom);
		int myDenom = (this.denom * other.denom);
		
		Fraction myFrac = new Fraction(myNum, myDenom);
		return myFrac;
	}
	//Returns a Fraction object that is the sum of this fraction and m
	public Fraction add(int m) {
		int myNum = (this.denom * m + this.num);
		Fraction myFrac = new Fraction(myNum, denom);
		
		return myFrac;
	}
	// Returns a Fraction object that is the product of this fraction and other
	public Fraction multiply(Fraction other) {
		int myNum = this.num  * other.num;
		int myDenom = this.denom * other.denom;
		
		Fraction myFrac = new Fraction(myNum, myDenom);
		
		return myFrac;
	}
	//method to multiply a fraction by an integer
	public Fraction multiply(int m) {
		int myNum = this.num * m;
		Fraction myFrac = new Fraction(myNum, denom);
		
		return myFrac;
	}
	//method to reduce the fraction to its simplest terms
	private void reduce() {
		int gcf = MyMathLib.gcf(Math.abs(num), Math.abs(denom));
		num /= gcf;
		denom /= gcf;
		if (denom < 0) { 
		   num = -num;
		   denom = -denom;
		   
		}
	}
	//method to print the fraction
	public String toString() { 
		return num + "/" + denom;
	}

}
