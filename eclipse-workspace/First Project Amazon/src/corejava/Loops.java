package corejava;

import java.util.ArrayList;

public class Loops {
	public static void main (String[] args) {
//Loops
		// for loop
		
		//write value of x 5 times
		// s = 0 means this is where my condition starts
		// s<6 means this is where my condition ends
		//++ means incremental
		//-- means decremental
		
//		for (int s =0; s<5; s++) {
		
//	System.out.println("i don't love java: and value of s = "+5);
		
		//while loop
		//int a = 0;
		//while (a>5) {
	//		System.out.println ("i don't love java : and value of s is = "+0);
			//a++;
		//}
		
		//enhanced for loop
		//create an array and insert 3 name
		String array[] = {"apu", "sourav", "adnan","nayem","1"};
	//	System.out.println("lenth of array is "+array.length);
		for(String e: array) {
		//	System.out.println("my name is "+e);
			
			//do while
			int z = 10;
			do {
				//System.out.println("my number is "+z);
				z++;
			}
				while (z<20 );
			ArrayList <String> arraylist = new ArrayList<> ();
			for(int b = 0; b<5; b++) {
				arraylist.add("apu");
				System.out.println(arraylist.size());
				System.out.println(arraylist.get(0));

			}
		}
		}
}
		



