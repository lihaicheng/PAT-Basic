package test0921;

import java.util.Scanner;
public class BasicLevel1008 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int time = s.nextInt()%n;
		int[] nums = new int[n];
		if(n > 0)
		{
			for(int i = 0;i < n;i++)
			{
				nums[i] = s.nextInt();
			}
		}
		else
		{
			return;
		}
		
		reverse(nums, 0, n - time - 1);
		reverse(nums, n - time, n - 1);
		reverse(nums, 0, n - 1);
		if(n > 0)
		System.out.print(nums[0]);
		if(n > 1)
		for(int i = 1;i < n;i++)
		{
			System.out.print(" " + nums[i]);
		}
		
		
	}
	public static void reverse(int[] nums,int start,int end)
	{
		int temp = 0;
		while(start <= end)
		{
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
