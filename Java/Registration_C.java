import java.util.Hashtable;
import java.util.Scanner;


public class Registration_C {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String parse = s.nextLine();
        int n = Integer.parseInt(parse);
        String[] request = new String[n];
        
        
        for(int i =0; i<n; i++)
        {
            request[i] = s.nextLine();
        }
        int num = 0;
        Hashtable<String, Integer> foo = new Hashtable<String,Integer>();
        
        for(int i =0; i<n; i++)
        {
            if(foo.containsKey(request[i]))
            {
                num = foo.get(request[i]);
                num++;
                foo.put(request[i], num);
                System.out.println(request[i]+num);
            }
            else
            {
                foo.put(request[i], 0);
                System.out.println("OK");
            }
        }
        
        
        
        
    }

}
