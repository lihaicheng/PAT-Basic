package test0921;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BasicLevel1006 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		Stack<String> s_s =new Stack<String>();
		int i = 0;
		while(n != 0)
		{
			int k = n % 10;
			if(k > 0)
			{
				for(int j = k;j >= 1;j--)
				{
					if(i == 0)
					{
						s_s.push("" + j);
					}
					if(i == 1)
					{
						s_s.push("S");
					}
					if(i == 2)
					{
						s_s.push("B");
					}
					
				}
			}
			
			n = n/10;
			i++;
		}
		
		while(!s_s.isEmpty())
		{
			System.out.print(s_s.pop());
		}
	}
}
