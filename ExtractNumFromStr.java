package interPro;

import java.util.Scanner;

public class ExtractNumFromStr {

	public static void main(String[] args) {
		
		//String str = "ja234 kd8u9";
		
		System.out.println("Enter te Strin ;");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] c = str.toCharArray();
		
		System.out.println("Te followin diits are in te str");
		for (char d : c) {
			if(Character.isDigit(d) ) {
				System.out.print(d);
			}
		}
		//System.out.println("Addtion of tose num are ; "+add);

	}

}
