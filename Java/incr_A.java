import java.util.Scanner;


public class incr_A {
public static void main(String[] args){
Scanner s = new Scanner(System.in);
String parse = " ";
parse = s.nextLine();
String[] temp = parse.split(" ");
int n = Integer.parseInt(temp[0]);
int d = Integer.parseInt(temp[1]);

parse = s.nextLine();
temp = parse.split(" ");
int[] seq = new int[n];

for(int i =0; i < n; ++i)
{
    seq[i] = Integer.parseInt(temp[i]);
}
int foo =0;

for(int i =1; i<n; i++)
{
    if(seq[i] <= seq[i-1])
    {
        foo += (seq[i-1] - seq[i])/d+1;
        seq[i] += ((seq[i-1] - seq[i])/d+1)*d;
    }
}
System.out.println(foo);
}
}
