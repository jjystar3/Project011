package string.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		String str1 = "a:b:c:d";
		System.out.println(str1.replace(':', '#'));
		
		String str2 = "안녕하세요 저는 둘리입니다";
		int strIndex = str2.indexOf("둘");
		System.out.println(str2.substring(strIndex, strIndex + 2));
		
	}

}
