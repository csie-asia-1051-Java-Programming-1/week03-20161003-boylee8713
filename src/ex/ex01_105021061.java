package ex;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021061 李柏毅
 */

import java.util.Scanner;

public class ex01_105021061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		String a = scn.nextLine();
		String b = new StringBuilder(a).reverse().toString();
		System.out.println(b);
		

	}

}