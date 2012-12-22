import java.util.Scanner;


public class baExam_B {
    
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        String parse = s.nextLine();
        String[] temp = parse.split(" ");
        int d= Integer.parseInt(temp[0]);
        int sT = Integer.parseInt(temp[1]);
        int[] min = new int[d];
        int[] max = new int[d];
        for(int i =0; i < d; i++)
        {
            parse = s.nextLine();
            temp = parse.split(" ");
            min[i] = Integer.parseInt(temp[0]);
            max[i] = Integer.parseInt(temp[1]);
        }
        int minT =0;
        int maxT = 0;
        int resultd[] = new int[d];
        for(int j =0; j < d; j++)
        {
            minT += min[j];
            maxT += max[j];
        }
        int t = sT - minT; 
        if(sT >= minT && sT <= maxT)
        {
            System.out.println("YES");
            for(int a =0; a<d; ++a)
            {
                if(t>= max[a] - min[a])
                {
                    
                    System.out.print((max[a]) + " ");
                    t -= max[a] - min[a];
                }
                else if(t > 0)
                {
                    t = min[a] + t;
                    System.out.print(t+ " ");
                    t = 0;
                }
                else
                {
                    System.out.print(min[a]+ " ");
                }
            }
        }
        else
        {
            System.out.println("NO");
        }
        
    }

}
