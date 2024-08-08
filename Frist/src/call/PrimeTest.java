package call;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		num=scanner.nextInt();//567
		int coin=20;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				coin=21;
				break;
				
			}
			System.out.println("I="+i);
		}
		if(coin==21)
		{
				System.out.println("Not prime");
		
			}
			else
			{
				System.out.println("Prime");
			}
		
		
	}
	
}
