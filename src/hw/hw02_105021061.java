package hw;

import java.util.Scanner;

public class hw02_105021061 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a = 0 ;
		int b = 0 ;
		int c = 0 ;
		System.out.print("�аݭn��J�X�Ӽ�:");
		int d = scn.nextInt();
		System.out.print("�п�J"+d+"�Ӽ�:");
		for(int i = 0;i<d;i++){
			int n = scn.nextInt();
			if(n>0)
				a++;
			else if(n<0)
				c++;
			else
				b++;
			}
			scn.close();
				System.out.println("����"+a+"�ӡA�t��"+c+"�ӡA�s"+b+"��");
			}
		}

