package test0921;

import java.util.Scanner;
public class BasicLevel1010 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String sn = s.nextLine();
		String[] numss = sn.split(" ");
		int[] nums1 = new int[numss.length];
		for(int i = 0;i < numss.length;i++)
		{
			nums1[i] = Integer.parseInt(numss[i]);
		} 
		int[] nums2 = new int[numss.length];
		for(int i = 0;i < numss.length;i = i + 2)
		{
			nums2[i] = nums1[i] * nums1[i+1];
		} 
		for(int i = 1;i < numss.length;i = i + 2)
		{
			nums2[i] = nums1[i] - 1;
		}
		if(nums2[1] < 0)
		{
			System.out.print("0 0");
			return;
		}else
		{
			System.out.print(nums2[0] + " " + nums2[1]);
			if(nums2.length > 2)
			{
				for(int i = 3;i < nums2.length;i = i +2)
				{
					if(nums2[i] > 0)
					{
						System.out.print(" " + nums2[i-1] + " " + nums2[i]);
					}
					else if(nums2[i] == 0)
					{
						System.out.print(" " + nums2[i-1] + " " + nums2[i]);
						return;
					}
					else if(nums2[i] < 0)
					{
						System.out.print(" 0 0");
						return;
					}
				}
			}
			
			
		}
		
	}
	
}
