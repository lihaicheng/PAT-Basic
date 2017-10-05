package test0924;

import java.util.Scanner;

public class BasicLevel1013 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int num0 = s.nextInt() - 1;
		int num1 = s.nextInt();
		
		//int[] num = new int[num1];
		boolean[] boo = new boolean[num1+1];
		for(int i = 3;i <= num1;i++)
		{
			boo[i] = true;
		}
		Prime(num1, boo);
		int k = 0;
		int i = 2;
		int j = 0;
		while(j < num0)
		{
			i++;
			if(boo[i])
			{
				j++;
			}
		}
		while(j < num1)
		{
			i++;
			if(boo[i])
			{
				System.out.print(i);
				if(k != 9)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.println();
					k = -1;
				}
				j++;
			}
		}
		
		
		/*int i = 0;
		int j = 2;
		
		while(i < num0)
		{
			j++;
			if(isPrime(j))
			{
				i++;
			}
		}
		
		int k = 0;
		while(i < num1)
		{
			if(isPrime(j))
			{
				System.out.print(j);
				if(k != 9)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.println();
					k = -1;
				}
				i++;
				k++;
			}
			j++;
			
		}*/
		
		
		
	}
	public static void Prime(int num1,boolean[] boo)
	{
		boo[0] = false;
		boo[1] = false;
		boo[2] = false;
		for(int i = 2;i < Math.sqrt(num1)+1;i++)
		{
			for(int j = 2;j < (num1 / i) + 1;j++)
			{
				boo[i * j] = false;
			}
		}
		
	}
	
	public static boolean isPrime(int num)
	{
		
		if (num <= 2){
	        return false;
	    }
	    
	    int ubound = (int) (Math.sqrt(num) + 1);
	    for (int i = 2; i < ubound; i++){
	        if (num%i == 0){
	            return false;
	        }
	    }
	    return true;
	}
	

}
