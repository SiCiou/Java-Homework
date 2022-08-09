package homework;

public class TestNineNine {

//	請建立一個TestNineNine.java程式，可輸出九九乘法表
	public static void main(String[] args) {
		
//		一：使用for迴圈 + while迴圈
		int digits;
		
		for(digits = 1; digits <= 9; digits++) {
			int tens = 1;
			while(tens <= 9) {
				System.out.print(tens +"*"+ digits +"="+ tens*digits +"\t");
				tens++;
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
//		二：使用for迴圈 + do while迴圈
		int digits2;
		for(digits2 = 1;digits2 <= 9; digits2++) {
			int tens2 = 1;
			do {
				System.out.print(tens2 +"*"+ digits2 +"="+ tens2*digits2 +"\t");
				tens2++;
			}while(tens2 <= 9);
			System.out.println();
		}
		
		System.out.println("\n");
		
//		三：使用while迴圈 + do while迴圈
		int digits3 = 0;
		while(digits3 < 9) {
			digits3++;
			int tens3 = 1;
			do {
				System.out.print(tens3 +"*"+ digits3 +"="+ tens3*digits3 +"\t");
				tens3++;
			}while(tens3 <= 9);
			System.out.println();
		}
	}
}
