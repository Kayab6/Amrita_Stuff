# include <stdio.h>

// sum of digits
void main(){


int i,num,digit,sum=0;
printf("enter num");
scanf("%d",&num);

while(num>0){
 digit=num%10;
 sum=sum+digit;
 num=num/10;
}
printf("%d",sum);

}
