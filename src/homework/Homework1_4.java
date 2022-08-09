package homework;

public class Homework1_4 {

//	請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	public static void main(String[] args) {
		final double pi = 3.1415;
		double area = 5 * 5 * pi;
		double circumference = (5 + 5) * pi;

		System.out.println("area=" + String.format("%.2f", area));
		System.out.println("circumference=" + String.format("%.2f", circumference));
	}
}
