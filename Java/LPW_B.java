import java.util.Scanner;


public class LPW_B {
static int maxEaten(int n, int m, char[][] a)
{
int[] dx = {-1,1,0,0};
int[] dy = {0,0,-1,1};
int foo = 0;

for(int i =0; i<n; i++)
    for(int j =0; j<m; j++)
    {
        if(a[i][j] == 'W')
        {
        int x = i;
        int y = j;
        for(int k =0; k<dx.length; k++)
        {
            x += dx[k];
            y += dy[k];
            if(x < 0 || x > n-1 || y < 0 || y > m-1)
            {	
            x = i;
            y = j;
            //System.out.println("continue");
            continue;
            }

            if(a[x][y] == 'P')
            {
            a[x][y] = '.';
            a[i][j] = '.';
            foo++;
            break;
            }
            x = i;
            y = j;	
            }
}
}
return foo;
}



public static void main(String[] args) {
Scanner s= new Scanner(System.in);
String parse = s.nextLine();
String[] temp = parse.split(" "); 
int n = Integer.parseInt(temp[0]);;
int m = Integer.parseInt(temp[1]);;

char a[][] = new char[n][m];
for(int i =0; i<n; i++){
    parse = s.nextLine();
    for(int j =0; j< m; j++)
    {
    a[i][j]= parse.charAt(j);
    }
    }
    int foo = maxEaten(n,m,a);
    System.out.println(foo);
    }
}


