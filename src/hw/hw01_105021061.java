package hw;

import java.util.Scanner;

public class hw01_105021061 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
    	System.out.println("�п�J�@�ӥ���ƭ�(���t 0)");
		long a = scn.nextLong();
		int b = 0;
		while (a > 0) {
			b++;
			a = a / 10;
		}
		System.out.println("���Ƭ�"+b+"���");
	}
}