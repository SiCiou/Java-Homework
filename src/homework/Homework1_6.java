package homework;

public class Homework1_6 {

/*	請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		5 + 5
		5 + ‘5’
		5 + “5”
		並請用註解各別說明答案的產生原因 
*/
	public static void main(String[] args) {
		
		System.out.println(5 + 5);
//		基本的運算,型別為int,出來為10
		
		System.out.println(5 + '5');
//		特殊字元版的5要先轉換成位元，Java預設是十進位 所以變成5 + 53
//		驗證的方式: 會印出 '5'
//		System.out.println((char)53);
		
		System.out.println(5+"5");
//		5加上字串的"5", 會印出55 但並不是int的55而是string的
	}
}
