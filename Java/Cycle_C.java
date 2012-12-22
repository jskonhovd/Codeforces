import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;




public class Cycle_C {
     static class Node implements Comparable<Node>{
        int x, y;
        int[] tri;
        public Node () {}
        public Node(int x, int y, int[] tri)
        {
            this.x = x;
            this.y = y;
            this.tri = tri;
        }
        public int compareTo(Node o)
        {
            //if(this.c > o.c) return 1;
            return -1;
        }
    }
    
    static int[] findCycle(boolean[][] adj, int n)
    {
        int[] tri = new int[4];
        int[] duck = {-1,-1,-1};
        boolean[][] edge = new boolean[n][n];
        for(int i =0; i < tri.length; i++)
        {
            tri[i] = -1;
        }
        Stack<Node> dos = new Stack<Node>();
        boolean[] vertex = new boolean[n];
        dos.push(new Node(0,0,tri));
        //System.out.println();
    
        int cnt = 0;
        tri[0] = 0;
        tri[3] = 99;
        while(!dos.isEmpty())
        { 
            Node bar = dos.pop();
            cnt = bar.y;
            vertex[bar.x] = true;
            tri = bar.tri;
            tri[cnt] = bar.x;
            //check for termination condition
            if(cnt==3)/////
            {
                if(tri[0] == tri[3])
                {
                return tri;
                }
                cnt = 0;
                continue;
            }
            
            for(int i =0; i<n; i++)
            {
                if(adj[bar.x][i] == true && !edge[bar.x][i] && !vertex[i])
                {    
                    edge[bar.x][i] = true;
                    dos.push(new Node(i,cnt+1,tri));
                    //System.out.println("Print:" + " " + (bar.x+1) + "----->" + (i+1));
                    //System.out.println((tri[0]+1) + " " + (tri[1]+1) + " " + (tri[2]+1) + " " + (tri[3]+1) + " ");
                    //System.out.println("CNT: " + cnt);
                }
            }
            
            vertex[bar.x] = false;
            
                  
        } 
        return duck;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner s= new Scanner(System.in);
        String parse = s.nextLine();
        int n = Integer.parseInt(parse);
        boolean[][] adj = new boolean[n][n];
        for(int i = 0; i < n; i++)
        {
        parse = s.nextLine();
        
        for(int j = 0; j < parse.length(); j++)
        {
           if(parse.charAt(j) == '1')
           {
               adj[i][j] = true;
           }
        }
        }
        
        boolean select = false;
        int[] tri = findCycle(adj,n);
        //System.out.println();
        //System.out.println();
        for(int i =0; i < tri.length-1; i++)
        {
            if(tri[i] == -1)
            {
                System.out.println(-1);
                select = true;
                break;
            }
            
        }
        if(!select)
        {
        for(int j = 0; j<tri.length-1; j++ )
        {
            System.out.print((tri[j]+1) + " ");
        }
        }
    }


}