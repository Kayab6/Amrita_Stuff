# include <stdio.h>

// sum of squares
void main(){

int i,n;

int sum=0;

printf("enter n ");
scanf("%d",&n);

for(i=1;i<=n;i++){
sum=sum+n*n;
}

printf("%d",sum);


}
