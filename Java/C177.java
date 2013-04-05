package code;


import java.util.Scanner;

public class C177 {

	/**
	 * @param args
	 */
	public String getValue(int n, int k) {
		
		String s = "";
		char c = 'c';
		
		int d = (n - k + 2) / 2;
		for(int i = 0; i < d; i++)
		{
			if (i < d)
			{
			 s += "ab";
			 
			}
		}
		if((n-k)%2 == 1)
		{
			s += 'a';
		}
		for(int j = 2; j<k; j++)
		{
			s += c;
			c++;
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		String parse = s.nextLine();
		String[] p = parse.split(" ");
		int n = Integer.parseInt(p[0]);
		int k = Integer.parseInt(p[1]);
		if(k > n || (k == 1 && n > 1))
		{
			System.out.println(-1);
		}
		else
		{
			C177 d = new C177();
			System.out.println(d.getValue(n,k));
			
		}
		
	}

}
