# include <stdio.h>

// n odd then no n is even then square 
void main(){

int i,n,j;

int sum=0;

printf("enter n ");
scanf("%d",&n);

for(i=1;i<=n;i++){
 if(i%2==0){
    sum=sum+i*i;
}
 else{sum=sum+i;}



}

printf("%d",sum);


}
