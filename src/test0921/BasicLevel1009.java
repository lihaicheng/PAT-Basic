package test0921;

import java.security.GeneralSecurityException;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class BasicLevel1009 {
	//这个例子使用了栈
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n_s = s.nextLine();
		String[] arr = n_s.split(" ");
		Stack<String> ss =new Stack<String>();
		for(int i = 0;i < arr.length;i++)
		{
			ss.push(arr[i]);
		}
		
		System.out.print(ss.pop());
		while(!ss.isEmpty())
		{
			System.out.print(" " + ss.pop());
		}
		

	}

}
