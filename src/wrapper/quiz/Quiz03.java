package wrapper.quiz;

import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();

		list.add('a'); // new Character('a')로 변환됨 - 오토박싱
		list.add('b');
		list.add('c');
		list.add('d');

		for (int i = 0; i < list.size(); i++) {
			char c = list.get(i); // list.get(i).charValue()로 변환됨 - 언박싱
			System.out.println(c);
		}

	}

}
