package call;

import java.util.Scanner;

public class RangeTest {

	public static void main(String[] args) {
		
		System.out.println("Enter your range");
		Scanner scanner=new Scanner(System.in);
		int sr,er;
		sr=scanner.nextInt();
		er=scanner.nextInt();
		for(int i=sr;i<=er;i++)
		{
			if(i%3==0)
			{
				System.out.println("/ by 3="+i);
				
			}
			if(i%4==0)
			{
				System.out.println("/ by 4="+i);
				
			}
			 if(i%5==0)
			{
				System.out.println("/ by 5="+i);
				
			} 
		}
	}
}
