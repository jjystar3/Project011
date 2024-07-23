package wrapper;

public class Ex02 {

	public static void main(String[] args) {
		
		// Integer의 객체 생성
		Integer iNum1 = new Integer(100);
		
		// 자바 버전이 올라가면서 생성자 생략
		Integer iNum2 = 100; //new Integer(100); 로 변환됨 (오토박싱)
		
		// Integer 객체에서 값 꺼내기
		int num1 = iNum1.intValue();
		int num2 = iNum1; // iNum1.intValue()로 변환됨 (언박싱)
		
		// 참조형과 기본형간의 연산 가능
		int num3 = iNum1 + 100; //iNum1.intValue() + 100 -> 100 + 100
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// Boolean 클래스
		
		
	}

}
