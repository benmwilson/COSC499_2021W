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

		

}
