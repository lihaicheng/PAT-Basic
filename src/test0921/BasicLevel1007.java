package test0921;

import java.util.Scanner;
public class BasicLevel1007 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int pair = 0;
		for(int i = 2;i < n-1;i++)
		{
			if(isPrime(i))
			{
				if(isPrime(i+2))
				{
					pair++;
					i = i+1;
				}
			}
		}
		System.out.println(pair);
	}
	public static boolean isPrime(int num)
	{
		//应当有下边的判断，但是从传入参数可以限制一下
		/*if (num < 2){
	        return false;
	    }*/
	    int i;
	    for (i = 2; i*i <= num; i++){
	        if (num%i == 0){
	            return false;
	        }
	    }
	    return true;
	}
}
