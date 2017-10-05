package test1005;

import java.util.Scanner;

public class BasicLevel1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] s1 = s.nextLine().split(" ");
		int num = Integer.parseInt(s1[0]);
		int low = Integer.parseInt(s1[1]);
		int high = Integer.parseInt(s1[2]);
		int[][] arrs1 = new int[num][];
		int[][] arrs2 = new int[num][];
		int[][] arrs3 = new int[num][];
		int[][] arrs4 = new int[num][];
		for(int i = 0 ; i < num ; i++)
		{
			s1 = s.nextLine().split(" ");
			int virtue = Integer.parseInt(s1[1]);
			int ability = Integer.parseInt(s1[2]);
			int[] arr = {virtue,ability,virtue+ability};
			if(virtue > high && ability > high)
			{
				arrs1[i] = arr;
			}
			
			
		}
	}
}
