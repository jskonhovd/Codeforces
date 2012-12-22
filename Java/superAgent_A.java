import java.util.Scanner;


public class superAgent_A {
    
    public static String find(char[][] a)
    {
        if(a[0][0] == a[2][2] && a[0][1] == a[2][1] && a[0][2] == a[2][0] && a[1][0] == a[1][2])
        {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String parse = " ";
        char[][] grid = new char[3][3];

        for(int i =0; i<3; i++)
        {
            parse = s.nextLine();
            
            for(int j =0; j<3; j++)
            {
                grid[i][j] = parse.charAt(j);
            }
        }
        String foo = find(grid);
        System.out.println(foo);
        }
        }
    

