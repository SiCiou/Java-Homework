package homework;

public class Homework1_5 {

//	某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
	public static void main(String[] args) {
		
		//注意!這裡只是做題用,算錢用浮點,遲早被人扁。
		double cash = 1500000 * Math.pow((1 + 0.02), 10);
		
		System.out.println("cash="+ String.format("%.0f", cash));
	}
}
