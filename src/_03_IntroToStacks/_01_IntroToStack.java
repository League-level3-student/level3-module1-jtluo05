package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	static Random r=new Random(100);
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> numbers = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		double num=0.0;
		for (int i = 0; i < 100; i++) {
			
			 num=r.nextDouble();
			num=num*100;
			numbers.push(num);
		}
	
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String answer1=JOptionPane.showInputDialog("Enter a number between 0-100.");
		String answer2=JOptionPane.showInputDialog("Enter another number between 0-100.");
		double one=Double.parseDouble(answer1);
		double two=Double.parseDouble(answer2);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		while(!numbers.isEmpty()) {
			double d=numbers.pop();
			if (one<d && d<two) {
				System.out.println(d);
			}
			else if (two<d && d<one) {
				System.out.println(d);
			}
		
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
