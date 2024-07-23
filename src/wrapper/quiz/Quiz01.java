package wrapper.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		byte bNum = Byte.parseByte("10");
		short sNum = Short.parseShort("10");
		int iNum = Integer.parseInt("10");
		long lNum = Long.parseLong("10");

		float fNum = Float.parseFloat("10.0");
		double dNum = Double.parseDouble("10.0");

		Double double1 = Double.parseDouble("10.0"); // 오토박싱됨

	}

}
