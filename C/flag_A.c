#include <stdio.h>
int main(void)
{
    int n,m,i,j;
    char a[100][100];
    scanf("%d %d", &n,&m);
    for(i =0; i<n; i++)
    {
        scanf("%s",a[i]);
        for(j =0; j<m-1; j++)
        {
            
            if(a[i][j] != a[i][j+1])
            {
                printf("NO\n");
                return 0;
            }
        }
    }
    
    for(i=0; i<n-1; i++)
    {
        if(a[i][0] == a[i+1][0])
        {
            printf("NO\n");
            return 0;
        }
    }
    printf("YES\n");
    return 0;
}
