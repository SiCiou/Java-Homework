package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Note {

	public static void main(String[] args) {
		
		
//呼叫最大最小值.MAX_VALUE, .MIN_VALUE
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		
		
//型別轉換成字元
//		System.out.println((char)25105);
	
		
//功能會把該浮點數資料百分比後兩位進行顯示與換行
//		System.out.printf(String.format("%.2f", 變數資料));
		
		
//比對字串
//		System.out.println(變數資料.equals("xxx"));
		
		
//次方運算 a的b個次方
//		System.out.println(Math.pow(a, b));
		
		
//自動取出陣列長度.length
//		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int sum = 0;
//		for (int i = 0; i < intArray.length; i++)
//			sum += intArray[i];

		
//陣列排序,呼叫sort方法並傳入欲進行排序的陣列
//		int[] intArray = {200, 300, 100};
//		Arrays.sort(intArray);
//		for(int i = 0; i < intArray.length; i++) {};
		
		
//複製陣列,呼叫copyOf方法並傳入兩個參數：欲複製的陣列、欲複製的陣列長度
//		int[] intArray2 = {100, 200, 300};
//		int[] intArray2B = Arrays.copyOf(intArray2, intArray2.length);
//		intArray2[0] = 0;
		
		
//二分搜尋法,搜尋陣列內的值,呼叫binarySearch方法並傳入兩個參數：欲搜尋的陣列、欲搜尋的值
//		int[] intArray3 = {100, 200, 300, 50};
//		// 注意：欲搜尋前必先將陣列進行排序
//		Arrays.sort(intArray3);
//		int i1 = Arrays.binarySearch(intArray3, 50);  // 有要搜尋的值
//		int i2 = Arrays.binarySearch(intArray3, 150); // 沒有搜尋到值
		
		
//String常用方法
//索引值(0)起頭尋找字元
//		String s1 = "Hello";
//		System.out.println(s1.charAt(4));
//取得字元數量(空白也算)
//		System.out.println(s1.length());
//isEmpty →檢查是不是空字串
//		String s4 = " ";
//		System.out.println(s4.isEmpty());
//去頭尾過濾系統trim()：頭尾空白都去掉
//		String s5 = " Hello ";
//		System.out.println(s5.trim());		
//擷取索引值的字元至結尾的字串,注意結束的索引值的字元不取
//		System.out.println(s1.substring(1));
//比較字串大小compare
//正整數->左邊的字串大於右邊的字串
//  0 -> 代表一樣大
//負整數->左邊的字串小於右邊的字串
//		System.out.println(s1.compareTo(s4));

		
//方法內使用 “...” →宣告可變數目的參數
//		public int varArgTest(int... c){}
		
		
//使用者可以於Console內輸入方式(Scanner)
//		Scanner sc = new Scanner(System.in);
//		sc.nextInt(); //自已看要甚麼型別Int以外的
		
		
//次方運算Math.pow
//		System.out.println(Math.pow(0, 0));
		
		
//圓周率Math.PI
//		System.out.println(Math.PI);
		
		
//隨機亂數Math.random
//		System.out.println(Math.random());
		
		
//利用getClass取得物件型別
//		bird b = new bird(10,10.0f);
//		System.out.println(b.getClass());
	
		
//JVM垃圾收集器
//		System.gc();
		
		
//toString接收物件時自動呼叫轉換
//		bird b = new bird(10,10.0f);
//		String str = b.toString();
		
		
//clone() 複製
//		bird b = new bird(10,10.0f);
//		bird.clone();
		
		
//字串轉換成數字Integer.parseInt()
//		String str = "100";
//		int num = Integer.parseInt(str);
	}
}
