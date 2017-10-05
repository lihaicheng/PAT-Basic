package test0926;

import java.util.Scanner;

public class BasicLevel1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[] s1 = s.nextLine().toCharArray();
		char[] s2 = s.nextLine().toCharArray();
		char[] s3 = s.nextLine().toCharArray();
		char[] s4 = s.nextLine().toCharArray();
		String ans1 = "";
		String ans2 = "";
		String ans3 = "";
		int first = 0;
		
		int len1 = (s1.length < s2.length)?s1.length:s2.length;
		int len2 = (s3.length < s4.length)?s3.length:s4.length;
		
		int len3 = (len1 < len2)?len2:len1;
		
		boolean end = false;
		
		for(int i = 0 ; i < len3 ; i++)
		{
			if(first != 2 && s1[i] == s2[i])
			{
				if(first == 0)
				{
					
					switch(s1[i])
					{
						case 'A':
							first = 1;
							ans1 = "MON ";
							continue;
						case 'B':
							first = 1;
							ans1 = "TUE ";
							continue;
						case 'C':
							first = 1;
							ans1 = "WED ";
							continue;
						case 'D':
							first = 1;
							ans1 = "THU ";
							continue;
						case 'E':
							first = 1;
							ans1 = "FRI ";
							continue;
						case 'F':
							first = 1;
							ans1 = "SAT ";
							continue;
						case 'G':
							first = 1;
							ans1 = "SUN ";
							continue;
					}
				}
				else if(first == 1)
				{
					first = 2;
					switch(s1[i])
					{
						case '0':ans2 = "0:";continue;
						case '1':ans2 = "1:";continue;
						case '2':ans2 = "2:";continue;
						case '3':ans2 = "3:";continue;
						case '4':ans2 = "4:";continue;
						case '5':ans2 = "5:";continue;
						case '6':ans2 = "6:";continue;
						case '7':ans2 = "7:";continue;
						case '8':ans2 = "8:";continue;
						case '9':ans2 = "9:";continue;
						case 'A':ans2 = "10:";continue;
						case 'B':ans2 = "11:";continue;
						case 'C':ans2 = "12:";continue;
						case 'D':ans2 = "13:";continue;
						case 'E':ans2 = "14:";continue;
						case 'F':ans2 = "15:";continue;
						case 'G':ans2 = "16:";continue;
						case 'H':ans2 = "17:";continue;
						case 'I':ans2 = "18:";continue;
						case 'J':ans2 = "19:";continue;
						case 'K':ans2 = "20:";continue;
						case 'L':ans2 = "21:";continue;
						case 'M':ans2 = "22:";continue;
						case 'N':ans2 = "23:";continue;
					}
				}
				
			}
			if(!end && s3[i] == s4[i] && ((s3[i] >= 'a' && s3[i] <= 'z') || (s3[i] >= 'A' && s3[i] <= 'Z') || (s3[i] >= '0' && s3[i] <= '9')))
			{
				end = true;
				if(i < 10)
				{
					ans3 = "0" + i;
				}
				else
				{
					ans3 = ""+i;
				}
			}
			if(first == 2 && end)
			{
				break;
			}
			
		}
		
		System.out.print(ans1+ans2+ans3);
		
	}

}
