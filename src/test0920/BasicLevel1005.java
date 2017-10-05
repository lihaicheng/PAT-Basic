package test0920;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class BasicLevel1005 {
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
		String ns = s.nextLine();
		int n = Integer.parseInt(ns);
		TreeMap<Integer , ArrayList<Integer>> tm = new TreeMap<Integer, ArrayList<Integer>>();
		int[] num = new int[n];
		String[] nums = s.nextLine().split(" ");
		boolean[] n_b = new boolean[n];
		
		for(int i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(nums[i]);
			n_b[i] = true;
			
		}
		ArrayList<Integer> ai = new ArrayList<Integer>();
		int temp = num[0];
		while(temp != 1)
		{
			if(temp % 2 == 0)
			{
				temp = even(temp);
			}
			else
			{
				temp = odd(temp);
			}
			ai.add(temp);
		}
		tm.put(num[0], ai);
		
		for(int i = 1;i < n;i++)
		{
			for(int j = i-1;j >= 0;j--)
			{
				//如果前边某个数包含了数i，则数i不是关键数
				if(n_b[j] && tm.get(num[j]).contains(num[i]))
				{
					n_b[i] = false;
					break;
				}
				
			}
			//如果数i是关键数，记录他的序列
			if(n_b[i])
			{
				ai.clear();
				temp = num[i];
				while(temp != 1)
				{
					if(temp % 2 == 0)
					{
						temp = even(temp);
					}
					else
					{
						temp = odd(temp);
					}
					ai.add(temp);
				}
				tm.put(num[i], ai);
			}
			//如果第i个值是关键数，并且该数的序列中包含了j，记录数j不是关键数
			for(int j = i-1;j >= 0;j--)
			{
				if(n_b[i] && tm.get(num[i]).contains(num[j]))
				{
					n_b[j] = false;
				}
			}
		}
		ai.clear();
		for(int i = 0;i < n;i++)
		{
			if(n_b[i])
			{
				ai.add(num[i]);
			}
		}
		Collections.sort(ai);
		Collections.reverse(ai);
		if(!ai.isEmpty())
		{
			System.out.print(ai.remove(0));
		}
		while(!ai.isEmpty())
		{
			System.out.print(" " + ai.remove(0));
		}
	}
}
