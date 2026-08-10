# include <stdio.h>

// n ki power n 
void main(){

int i,n,j;

int sum=0;

printf("enter n ");
scanf("%d",&n);

for(i=1;i<=n;i++){
int pow=1;
  for(j=1;j<=i;j++){
      pow=pow*i;
  }
  sum=sum+pow;

}

printf("%d",sum);


}
