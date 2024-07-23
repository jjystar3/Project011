package wrapper.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		String str = scanner.nextLine();
		
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
//		String[] strArr = str.split(", ");

		int result = Integer.parseInt(str1) + Integer.parseInt(str2);
//		int result = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);
		
		System.out.println(result);
		
	}

}
