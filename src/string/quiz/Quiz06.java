package string.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("문장을 입력하세요: ");
			String str = scanner.nextLine();

			if (str.equals("end") || str.equals("END")) {
				break;
			}
			if (str.toLowerCase().equals("end")) {
				break;
			}
			if (str.equalsIgnoreCase("end")) {
				break;
			}
		}

	}

}
