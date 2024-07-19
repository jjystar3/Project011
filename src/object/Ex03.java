package object;

public class Ex03 {

	public static void main(String[] args) {

	}

}

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.id == student.id) {
				return true;
			}
		}
		
		return false;
	}

}