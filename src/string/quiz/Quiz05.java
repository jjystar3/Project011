package string.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(str.length() - 1 - i));
		}

	}

}
