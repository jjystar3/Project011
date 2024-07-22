package string.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		
		int result = getCharCount("자바 프로그래밍 입문");
		System.out.println(result);
		
		int result2 = getCharCount("equals 메소드는 두 객체가 같은지 비교한다");
		System.out.println(result2);

	}

	static int getCharCount(String str) {

		int realLength = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				realLength++;
			}
		}

		return realLength;
	}

}