import java.util.Scanner;


public class VIG_B {
    
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        String parse = s.nextLine();
        String[] temp = parse.split(" ");
        boolean dosduck = false;
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        int mod = Integer.parseInt(temp[2]);
        for(int i =0; i<=a && i<mod; i++)
        {
            if((mod -(long)i*1000000000%mod)%mod>b)
            {
                System.out.printf("1 %09d\n",i);
                dosduck = true;
                break;
            }
        }
        if(!dosduck)
        {
        System.out.println("2");
        }
        
    }

}
