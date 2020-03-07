package durgaJava8;

import java.util.function.Function;

public class Lab1_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function <Integer,Integer> f= i-> i*i;
System.out.println("the squar fo 4 = "+f.apply(4));
System.out.println("the squar of 5 = "+f.apply(5));
System.out.println("the squar of 5 = "+f.apply(5));
System.out.println("the squar of 5 = "+f.apply(5));
	}

}
