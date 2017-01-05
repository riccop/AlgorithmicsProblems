package rcop;

import rcop.MathAlgoritmics;
import java.lang.System;

public class RecursiveFibonnaci{
	
	public static void main(String[] args){
		System.out.println(""+MathAlgoritmics.recursiveFibonnaci(Integer.parseInt(args[0])));
	}
	
}