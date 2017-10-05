package test0922;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BasicLevel1012 {
	//格式化数字

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] nums = s.nextLine().split(" ");
		int n = Integer.parseInt(nums[0]);
		//int[] num = new int[n];
		int sum1 = 0;
		boolean has1 = false;
		int sum2 = 0;
		int flag2 = 1;
		boolean has2 = false;
		int sum3 = 0;
		boolean has3 = false;
		Double sum4 = 0.0;
		int n4 = 0;
		boolean has4 = false;
		int temp5 = Integer.MIN_VALUE;
		boolean has5 = false;
		for(int j = 1;j <= n;j++)
		{
			int num = Integer.parseInt(nums[j]);
			int numM5 = num % 5;
			if(num % 2 == 0 && numM5 == 0)
			{
				sum1 = sum1 + num;
				has1 = true;
			}
			if(numM5 == 1 && flag2 ==1)
			{
				sum2 = sum2 + num;
				flag2++;
				has2 = true;
				continue;
			}
			if(numM5 == 1 && flag2 ==2)
			{
				sum2 = sum2 - num;
				flag2--;
			}
			if(numM5 == 2 )
			{
				sum3 = sum3 + 1;
				has3 = true;
			}
			if(numM5 == 3 )
			{
				sum4 = sum4 + num;
				n4++;
				has4 = true;
			}
			if(numM5 == 4 && temp5 < num)
			{
				temp5 = num;
				has5 = true;
			}
			
			
		}
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.print((has1? ""+sum1 : "N") + " " 
				+(has2? ""+sum2 : "N") + " " 
				+(has3? ""+sum3 : "N") + " " 
				+(has4? ""+df.format(sum4/n4) : "N") + " " 
				+(has5? ""+temp5 : "N"));
		
	}
	public static String getA1ToA5(int[] num)
	{
		int sum1 = 0;
		boolean has1 = false;
		int sum2 = 0;
		int flag2 = 1;
		boolean has2 = false;
		int sum3 = 0;
		boolean has3 = false;
		Double sum4 = 0.0;
		int n4 = 0;
		boolean has4 = false;
		int temp5 = Integer.MIN_VALUE;
		boolean has5 = false;
		for(int j = 0;j < num.length;j++)
		{
			if(num[j] % 2 == 0 && num[j] % 5 == 0)
			{
				sum1 = sum1 + num[j];
				has1 = true;
			}
			if(num[j] % 5 == 1 && flag2 ==1)
			{
				sum2 = sum2 + num[j];
				flag2++;
				has2 = true;
				continue;
			}
			if(num[j] % 5 == 1 && flag2 ==2)
			{
				sum2 = sum2 - num[j];
				flag2--;
			}
			if(num[j] % 5 == 2 )
			{
				sum3 = sum3 + 1;
				has3 = true;
			}
			if(num[j] % 5 == 3 )
			{
				sum4 = sum4 + num[j];
				n4++;
				has4 = true;
			}
			if(num[j] % 5 == 4 && temp5 < num[j])
			{
				temp5 = num[j];
				has5 = true;
			}
			
			
		}
		DecimalFormat df = new DecimalFormat("#.#");
		return (has1? ""+sum1 : "N") + " " 
		+(has2? ""+sum2 : "N") + " " 
		+(has3? ""+sum3 : "N") + " " 
		+(has4? ""+df.format(sum4/n4) : "N") + " " 
		+(has5? ""+temp5 : "N");
		
	}
	
	public static String getA1(int[] num)
	{
		int sum = 0;
		boolean has = false;
		for(int j = 0;j < num.length;j++)
		{
			if(num[j] % 2 == 0 && num[j] % 5 == 0)
			{
				sum = sum + num[j];
				has = true;
			}
		}
		if(has)
		{
			return ""+sum;
		}
		else
		{
			return "N";
		}
		
	}
	public static String getA2(int[] num)
	{
		int sum = 0;
		int flag = 1;
		boolean has = false;
		for(int j = 0;j < num.length;j++)
		{
			if(num[j] % 5 == 1 && flag ==1)
			{
				sum = sum + num[j];
				flag++;
				has = true;
				continue;
			}
			if(num[j] % 5 == 1 && flag ==2)
			{
				sum = sum - num[j];
				flag--;
			}
		}
		if(has)
		{
			return ""+sum;
		}
		else
		{
			return "N";
		}
	}
	public static String getA3(int[] num)
	{
		int sum = 0;
		boolean has = false;
		for(int j = 0;j < num.length;j++)
		{
			if(num[j] % 5 == 2 )
			{
				sum = sum + 1;
				has = true;
			}
		}
		if(has)
		{
			return ""+sum;
		}
		else
		{
			return "N";
		}
	}
	public static String getA4(int[] num)
	{
		Double sum = 0.0;
		int n = 0;
		boolean has = false;
		for(int j = 0;j < num.length;j++)
		{
			if(num[j] % 5 == 3 )
			{
				sum = sum + num[j];
				n++;
				has = true;
			}
		}
		DecimalFormat df = new DecimalFormat("#.#");
		if(has)
		{
			return df.format(sum/n);
		}
		else
		{
			return "N";
		}
	}
	public static String getA5(int[] num)
	{
		int temp = Integer.MIN_VALUE;
		boolean has = false;
		for(int j = 0;j < num.length;j++)
		{
			if(num[j] % 5 == 4 && temp < num[j])
			{
				temp = num[j];
				has = true;
			}
		}
		if(has)
		{
			return ""+temp;
		}
		else
		{
			return "N";
		}
	}

}
