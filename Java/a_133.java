import java.util.Scanner;

public class a_133 {
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    
	    System.out.println((a*b*c)-((a-1)*(b-1)*(c-1)));
	}

	
}
