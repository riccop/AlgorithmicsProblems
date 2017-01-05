package rcop;

import java.lang.System; 
import java.lang.Math;

public class MathAlgoritmics{
	
	//fibonnaci | 0 1 1 2 3 5 8 13 21 34 55 ...
	//f(n) = f(n-1) + f(n-2) && f(0) = 0, f(1) = 1
	
	//fibonnaci recursive method
	public static int recursiveFibonnaci(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;	
		return recursiveFibonnaci(n-1) + recursiveFibonnaci(n-2);
	}

	//fibonnaci iterative method
	public static int iterativeFibonnaci(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		int f1 = 1,f2 = 1;
		int fibonnaci = 1;
		for(int i = 3;i<=n;i++)
		{
			fibonnaci = f1 + f2;
			f1=f2;
			f2=fibonnaci;
		}
		return fibonnaci;
	}
	
	//pascal pyramid                          line/column  0 1 2 3 4 
	//     1                                          0    1       
	//    1 1                                         1    1 1
	//   1 2 1                                        2    1 2 1
	//  1 3 3 1                                       3    1 3 3 1
	// 1 4 6 4 1                                      4    1 4 6 4 1
	//    ...										            
	
	//pascal pyramid recursive method
	public static int recursivePascalPyramid(int line, int column){
		if(line<column){//line is never > column swap line with column
			int c = column;
			column = line;
			line = c;
		}
		
		if(column==0||column==line)
			return 1;
		return recursivePascalPyramid(line-1, column) + recursivePascalPyramid(line-1,column-1);
	}
	
	//pascal pyramid iterative method
	public static int iterativePascalPyramid(int line, int column){
		if(line<column){//line is never > column swap line with column
			int c = column;
			column = line;
			line = c;
		}
		if(column==0||column==line)
			return 1;
		int pascalPyramid[][] = new int[line+1][column+1];
		pascalPyramid[1][0] = 1;
		pascalPyramid[1][1] = 1;
		for(int l=2;l<line;l++)
			for(int c=0;c<=column;c++){
				if(c==0 || c==l){
					pascalPyramid[l][c] = 1;
				}else
					pascalPyramid[l][c] = pascalPyramid[l-1][c]+pascalPyramid[l-1][c-1];
			}
		return pascalPyramid[line-1][column]+pascalPyramid[line-1][column-1];
	}
	
	//numbers sequence
	//0 1 8 27 64 0 1 8 27 64 0 1 8 27 64 ...
	//0^3 =0, 1^3=1, 2^3=8, 3^3=27, 4^3=64, ...
	//x%5=rest of x, e.g., 5%5 = 0.
	public static int numSequence(int n){
		int rest = n%5;
		return rest*rest*rest;
	}

}