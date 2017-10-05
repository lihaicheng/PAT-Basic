package test0920;

import java.util.Scanner;

public class BasicLevel1001 {
	public static int even(int even)
	{
		return even/2;
	}
	public static int odd(int odd)
	{
		return (3*odd+1)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int time = 0;
		while(n != 1)
		{
			if(n % 2 == 0)
			{
				n = even(n);
			}
			else
			{
				n = odd(n);
			}
			System.out.println(n);
			time++;
		}
		System.out.println(time);

	}

}
