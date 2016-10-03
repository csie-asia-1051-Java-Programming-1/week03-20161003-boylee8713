package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021061 李柏毅
 */

import java.util.Scanner;

public class ex02_105021061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		char chr=src.next().charAt(0);
		if(chr>=65&& 90>=chr)
		{
			System.out.print("大寫");
		}
		else if(chr>=97 && 122>=chr)
		{
			System.out.print("小寫");
		}
		else
		{
			System.out.print("其他");
		}
	}

}