package string;

public class Ex03 {

	public static void main(String[] args) {

		String str = "java";
		System.out.println("str의 주소: " + System.identityHashCode(str));
		str += " and";
		str += " android";
		System.out.println("값 변경 후 str의 주소: " + System.identityHashCode(str));
		System.out.println(str);
		System.out.println();

		// String 클래스는 값을 변경하면 문자열이 계속 생성되서 메모리가 낭비됨
		// 문자열이 자주 변경된다면 StringBuilder를 사용할 것
		StringBuilder buffer = new StringBuilder("java"); //StringBuilder 객체 생성
		System.out.println("buffer의 주소: " + System.identityHashCode(buffer)); //인스턴스가 처음 생성되었을 때 메모리 주소
		buffer.append(" and"); //문자열 추가
		buffer.append(" android");
		System.out.println("값 변경 후 buffer의 주소: " + System.identityHashCode(buffer)); //하나의 메모리에 계속 문자열이 연결되어 주소가 같음
		System.out.println(buffer.toString()); //다시 문자열로 반환	

	}

}
