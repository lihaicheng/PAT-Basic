package test0920;

import java.util.Scanner;
import java.util.TreeMap;

public class BasicLevel1004 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String n_s = s.nextLine();
		int n = Integer.parseInt(n_s);
		
		TreeMap<Integer , String> tm = new TreeMap<Integer, String>();
		for(int i = 0;i < n;i++)
		{
			String ss = s.nextLine();
			String[] nns = ss.split(" ");
			tm.put(Integer.valueOf(nns[2]), nns[0] + " " + nns[1]);
		}
		System.out.println(tm.get(tm.lastKey()));
		System.out.println(tm.get(tm.firstKey()));
	}
}
