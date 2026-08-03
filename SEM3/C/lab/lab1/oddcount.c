
// odd num bw m n n n count

# include <stdio.h>

void main(){
    int i,n,m,count=0;
    printf("enter ur n ");
    scanf("%d",&n);
    printf("enter ur m ");
    scanf("%d",&m);
    for(int i=n;i<=m;i++){
    
    if(i%2!=0)
    {printf("%d\n",i);
    count=count+1;}
    
    
    }
    printf("the count is: %d",count);
}
