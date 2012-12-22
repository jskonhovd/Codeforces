import java.util.Scanner;


public class Watermelon_A {
    
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        String parse = s.nextLine();
        int N= Integer.parseInt(parse);;
        
        if(N%2==0 && N>=4)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

}
