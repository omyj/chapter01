package chapter01;

import java.util.Scanner;

class PrintText {
	String text;

	public void print() {
		System.out.println("scan : ");
		Scanner scan = new Scanner(System.in);
		this.text = scan.nextLine();
		System.out.println(this.text);
	}
}

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println("sum :" + (left + right));
	}

	public void sub() {
		System.out.println("sub :" + (left - right));
	}

}

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintText p1 = new PrintText();
		VariableTest v1 = new VariableTest();
		Calculator c1 = new Calculator();

		p1.print();
		v1.variableTest();
		c1.setOprands(10, 20);
		c1.sum();
		c1.sub();

	}
}
