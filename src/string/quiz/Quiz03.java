package string.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		String str = "자바 프로그래밍 입문";
		int strCount = 0;

		String[] strArr = str.split(" ");

		for (String s : strArr) {
			strCount += s.length();
		}

		System.out.println("공백을 제외한 글자수는 " + strCount + "입니다.");
		

    	int realLength = 0;
        for (int i = 0; i < str.length(); i++) {
            
            //공백도 문자로 취급함
            
            if (str.charAt(i) != ' ') {  // 공백이 아니면 숫자 증가
            	realLength++;
            }
        }

    	System.out.println(str.length()); // 공백을 포함한 길이는 11
        System.out.println(realLength);  // 공백을 제거한 길이는 9
	}

}
