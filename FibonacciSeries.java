package com.fibonacci.series;

public class FibonacciSeries {
public static int sum;
public static int counter;
public static int fibo(int count)	{
	counter++;
	if(count ==1 || count == 0)
	{
		
		return count;
	}
	sum = fibo(count-1) + fibo(count-2);
	
return sum;
}



public static void main(String[] args) {
for(int i=2; i< 10; i++)
	System.out.println("fibo of " + (i-1) + " is "+ fibo(i-2));
System.out.println(counter);
}
}
