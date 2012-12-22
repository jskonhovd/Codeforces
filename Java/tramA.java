import java.util.Scanner;

public class tramA {
static int findMin(int N,int[] a, int[] b)
{
int cap = 0;
int min = 0;
for(int i = 0; i < N; i++)
{
    cap -= a[i];
    cap += b[i];
    min = Math.max(cap, min);
}
return min;
}

public static void main(String[] args) {
Scanner s= new Scanner(System.in);
String parse = s.nextLine();
int N= Integer.parseInt(parse);;
int[] b = new int[N];
int[] a = new int[N];

for(int i =0; i<N; i++)
{
    parse = s.nextLine();
    String[] temp = parse.split(" "); 
    a[i] = Integer.parseInt(temp[0]);;
    b[i] = Integer.parseInt(temp[1]);;
}
int foo = findMin(N,a,b);
System.out.println(foo);
}
}
