package test0922;

import java.util.Scanner;

public class BasicLevel1011 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String ts = s.nextLine();
		int t = Integer.parseInt(ts);
		if(t == 0)
		{
			return;
		}
		String[] info = new String[t];
		for(int i = 0;i < t;i++)
		{
			
			String[] nums = s.nextLine().split(" ");
			long[] num = new long[3];
			for(int j = 0;j < 3;j++)
			{
				num[j] = (long)Integer.parseInt(nums[j]);
			}
			if(num[0] + num[1] > num[2])
			{
				info[i] = "Case #" + (i+1) +": true";
			}
			else
			{
				info[i] = "Case #" + (i+1) +": false";
			}
		}
		for(int i = 0;i < t;i++)
		{
			System.out.println(info[i]);
		}
	}

}
