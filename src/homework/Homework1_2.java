package homework;

public class Homework1_2 {

//	請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	public static void main(String[] args) {
		
		int dozen = 200 / 12;
		int remainder = 200 % 12;
		
		System.out.println(dozen +"打"+ remainder +"顆");
	}
}
