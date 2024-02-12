package interview;

import java.util.Scanner;

public class Calculator {
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static double multiply(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		int a;
		int b;
		Character operator;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value a");
		a=scanner.nextInt();
		System.out.println("enter the operator");
		operator=scanner.next().charAt(0);
		System.out.println("enter the value of b");
		b=scanner.nextInt();
		if(operator=='+') {
			int add = add(a, b);
			System.out.println(add);
		}
		if(operator=='-') {
			int sub=sub(a,b);
			System.out.println(sub);
		}
		if(operator=='*') {
			double mul=multiply(a,b);
			System.out.println(mul);
		}
		
		
		
	}
}
