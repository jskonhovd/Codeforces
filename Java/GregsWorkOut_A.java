import java.util.Arrays;
import java.util.Scanner;


public class GregsWorkOut_A {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] ans = new int[3];
		String[] sans = {"chest", "biceps", "back"};
		for(int i =0; i<a; i++)
		{
			ans[(i % 3)] += sc.nextInt();
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < 3; i++)
		{
			
			if(ans[i] > max)
			{
				max = Math.max(max, ans[i]);
				index = i;
			}
			
		}
		
		System.out.println(sans[index]);
	}
	
}
