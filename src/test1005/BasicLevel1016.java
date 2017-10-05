package test1005;

import java.util.Scanner;

public class BasicLevel1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] s1 = s.nextLine().split(" ");

		int i1 = Integer.parseInt(s1[0]);
		int i2 = Integer.parseInt(s1[1]);
		int num1 = 0;
		int i3 = Integer.parseInt(s1[2]);
		int i4 = Integer.parseInt(s1[3]);
		int num2 = 0;
		while(i1 > 0)
		{
			if(i1 % 10 == i2)
			{
				num1 = num1 * 10 + i2;
			}
			i1 = i1 / 10;
		}
		while(i3 > 0)
		{
			if(i3 % 10 == i4)
			{
				num2 = num2 * 10 + i4;
			}
			i3 = i3 / 10;
		}

		System.out.print(num1 + num2);
	}
}
