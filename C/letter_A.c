#include <stdio.h>
int main(void)
{
    int n,m,i,j;
    scanf("%d %d", &n,&m);
    char a[n][m];
    
    for(i =0; i < n; i++)
    {
        for(j =0; j<m; j++)
        {
            scanf(" %c",&a[i][j]);
        }
    }
    printf("YES\n %c", a[4][4]);
    return 0;
}
