package call;

import java.util.Scanner;

public class ReverseofNumber {

	public static void main(String[] args) {
		
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		num=scanner.nextInt();//567
		int a,sum=0;  //
		for(;num>0;)
		{
		a=num%10; 
		sum=sum*10+a;
		num=num/10;
		System.out.println("a="+a+" step wise sum="+sum);
		}
		System.out.println("final sum="+sum);
		
		
		
		
		
		
		
		
		
		
	}
	
}
