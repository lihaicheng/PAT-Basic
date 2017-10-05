package test0920;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicLevel1003 {
	//这个例子使用了正则表达式
	static Pattern pattern = Pattern.compile("A*");
	static Pattern patternForb = Pattern.compile("A*A");
	public static String whichIsYes(String s)
	{
		int p = s.indexOf("P");
		int t = s.indexOf("T");
		if(p == -1 || t == -1 || p > t)
		{
			return "NO";
		}
		String a = s.substring(0, p);
		String b = s.substring(p+1, t);
		String c = s.substring(t+1, s.length());
		Matcher ma = pattern.matcher(a);
		Matcher mb = patternForb.matcher(b);
		Matcher mc = pattern.matcher(c);
		if(!ma.matches() || !mb.matches() || !mc.matches())
		{
			return "NO";
		}
		if(a.length() * b.length() != c.length())
		{
			return "NO";
		}
		return "YES";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n_s = s.nextLine();
		int n = Integer.parseInt(n_s);
		ArrayDeque<String> s_a = new ArrayDeque<String>();
		for(int i = 0;i < n;i++)
		{
			String ss = s.nextLine();
			s_a.add(whichIsYes(ss));
		}
		while(!s_a.isEmpty())
		{
			System.out.println(s_a.poll());
		}
		

	}

}
