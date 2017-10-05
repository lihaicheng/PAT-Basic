package test0920;

import java.security.GeneralSecurityException;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class BasicLevel1002 {
	//这个例子使用了栈
	public static String changeToPinyin(int i)
	{
		switch(i)
		{
			case 0:return "ling";
			case 1:return "yi";
			case 2:return "er";
			case 3:return "san";
			case 4:return "si";
			case 5:return "wu";
			case 6:return "liu";
			case 7:return "qi";
			case 8:return "ba";
			case 9:return "jiu";
		}
		return null;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n_s = s.nextLine();
		char[] n_c = n_s.toCharArray();
		
		
		int res = 0;
		for(int i = 0;i < n_c.length;i++)
		{
			res = res + Character.getNumericValue(n_c[i]);
			
		}
		int temp = 0;
		Stack<String> r_s =new Stack<String>(); 
		while(res != 0)
		{
			r_s.push(changeToPinyin(res % 10));
			res = res / 10;
		}
		System.out.print(r_s.pop());
		while(!r_s.isEmpty())
		{
			System.out.print(" " + r_s.pop());
		}
		

	}

}
