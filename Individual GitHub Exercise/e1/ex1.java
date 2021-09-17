package e1;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Do you want to sort Integers or Strings?");
		System.out.print("Enter 1 for int and 2 for String: ");
		int c = s.nextInt();

		System.out.print("Enter a list seperated by spaces: ");
		s.nextLine();
		String ss = s.nextLine();

		String words[] = ss.split(" ");

		if (c == 1) {
			sortInt(words);

		} else if (c == 2) {
			sortString(words);
		}

	}

	public static void sortInt(String[] a) {

		int[] myIntArray = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			myIntArray[i] = Integer.parseInt(a[i]);
		}

		Arrays.sort(myIntArray);

		System.out.println("Your sorted list of Integers: ");
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}

	}

	public static void sortString(String[] a) {
		Arrays.sort(a);

		System.out.println("Your sorted list of Strings: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

