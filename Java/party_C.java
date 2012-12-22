import java.util.Scanner;


public class party_C {	
static int minGroups(int N, int[] e)
{
    int foo = 0;	
    for(int i = 1; i<= N; i++)
    {
	    int curr = 1;
        int pos = i;
        while (e[pos] != -1) {
            curr++;
            pos = e[pos];
        }
        foo = Math.max(foo, curr);
    }
	return foo;
}

public static void main(String[] args) {
Scanner s= new Scanner(System.in);
String parse = s.nextLine();
int N= Integer.parseInt(parse);
int[] e = new int[N+1];
e[0] = -1;
for(int i = 1; i<=N; i++)
{
    parse = s.nextLine();
    e[i]= Integer.parseInt(parse);
}
int foo = minGroups(N,e);
System.out.print(foo);
}
}
