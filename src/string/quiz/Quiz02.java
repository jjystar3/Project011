package string.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		String pin = "881120-1068234";

		char genderNum = pin.charAt(7);
		// int genderNum2 = Character.getNumericValue(genderNum); // char를 int로 변환

		if (genderNum == '1' || genderNum == '3') {
			System.out.println("남자");

		} else if (genderNum == '2' || genderNum == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 값입니다");
		}

	}

}
