package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> s=new ArrayList<>();
		//2. Add five Strings to your list
s.add("jordan");
s.add("jessica");
s.add("forty five");
s.add("pickle");
s.add("octogon");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < s.size(); i++) {
			String words = s.get(i);
			System.out.println(words);
		}
		
		//4. Print all the Strings using a for-each loop
		for(String i : s){
			
			System.out.println(i);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < s.size(); i++) {
			if (i%2==0) {
				System.out.println(s.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = s.size()-1; i > -1; i--) {
			System.out.println(s.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < s.size(); i++) {
		String words3=s.get(i);
			if (words3.equals("pickle")||words3.equals("forty five")||words3.equals("jessica")) {
				System.out.println(words3);
			}
		}
	}
}
