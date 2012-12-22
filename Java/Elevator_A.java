import java.util.Scanner;


public class Elevator_A {
    
    static int[] findMin(int n, int m, int[] s, int[] f, int[] t)
    {
        //s is the floor where the person starts
        // f is the floor that they wish to reach
        // t is the time they get to the floor s.
        int mod = 2*m-2;
        boolean[] duck = new boolean[n];
        boolean dosduck = true;
        int[] foo = new int[n]; 
        for(int i =0; i<n; i++)
        {
            if(s[i] == f[i])
            {
                foo[i] = t[i];
                continue;
            }
            s[i]--;
            f[i]--;
            int offs = t[i]%mod;
            int base = t[i]-offs;
            if(s[i]<f[i])
            {
                if(s[i]<offs)
                {
                    base +=mod;
                }
                foo[i] = base + f[i];    
            }
            else // s>f
            {
                int s2 = m - 1 - s[i];
                if(m - 1 + s2<offs)
                {
                    base +=mod;
                }
                int f2 = m -1 - f[i];
                foo[i] = m -1 + f2 + base;
            }
            
        }
   
        return foo;
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String parse = scan.nextLine();
        String[] temp = parse.split(" "); 
        
        int n= Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        int[] s =  new int[n];
        int[] f = new int[n];
        int[] t = new int[n];
        for(int i =0; i<n; i++)
        {
            parse = scan.nextLine();
            temp = parse.split(" ");
            s[i] = Integer.parseInt(temp[0]);
            f[i] = Integer.parseInt(temp[1]);
            t[i] = Integer.parseInt(temp[2]);
        }
        int[] foo = findMin(n,m,s,f,t);
        for(int i = 0; i<foo.length; i++)
            System.out.println(foo[i]);
    }
    
}
