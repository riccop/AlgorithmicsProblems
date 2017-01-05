package rcop;

import rcop.MathAlgoritmics;
import java.lang.System;

public class RecursivePascalPyramid{
	
	public static void main(String[] args){
		System.out.println(""+MathAlgoritmics.recursivePascalPyramid(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
	
}