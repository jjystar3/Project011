package object;

public class Quiz02 {

	public static void main(String[] args) {

		Object object = new Student(1001, "홍길동");

		if (object instanceof Student) {
			Student student = (Student) object;
			System.out.println("학번: " + student.id + ", 이름: " + student.name);
		}

	}

}
