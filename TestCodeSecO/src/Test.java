import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
	System.out.println("Test");	
	
	Test test=new Test();
	test.testCall();
	
	}
	public void testCall() {
		
	
		
		int a,b,c;
		System.out.println("ENte ryour number");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
		if(c>30)
		{
			System.out.println("Add="+c);
		}
		else
		{
			System.out.println("Called");
			Test test=new Test();
			test.testCall();
			System.out.println("Called end");
		
		}
		
		
	}
	
}
