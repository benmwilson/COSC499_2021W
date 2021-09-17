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
			int[] nums = sortInt(words);
			System.out.println("Your sorted list of Integers: ");
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}

		} else if (c == 2) {
			words = sortString(words);
			System.out.println("Your sorted list of Strings: ");
			for (int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
			}
		}

	}

	public static int[] sortInt(String[] a) {

		int[] myIntArray = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			myIntArray[i] = Integer.parseInt(a[i]);
		}

		Arrays.sort(myIntArray);
		return myIntArray;

	}

	public static String[] sortString(String[] a) {
		Arrays.sort(a);
		return a;
	}

}