import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENter your input");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a+b;
		System.out.println(c);
	}
}
