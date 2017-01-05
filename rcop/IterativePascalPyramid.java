package rcop;

import rcop.MathAlgoritmics;
import java.lang.System;

public class IterativePascalPyramid{
	
	public static void main(String[] args){
		System.out.println(""+MathAlgoritmics.iterativePascalPyramid(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
	
}