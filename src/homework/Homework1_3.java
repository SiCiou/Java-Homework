package homework;

public class Homework1_3 {

//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	public static void main(String[] args) {
		
		int day = (256559) / (60 * 60 * 24);
		int hour = (256229) % (60 * 60 * 24) / (60 * 60);
		int min = (256229) % (60 * 60 * 24) % (60 * 60) / 60;
		int sec = (256229) % (60 * 60 * 24) % (60 * 60) % 60;
		
		System.out.println(day +"day"+ hour +"hour"+ min +"min"+ sec +"sec");
	}
}
