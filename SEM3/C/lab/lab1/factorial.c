// factorial of a number

# include <stdio.h>


void main(){
int num,i,fac=1;
printf("enter the number of which u wanna find factorial");
scanf("%d",&num);

for(int i=1;i<=num;i++){
if(num==0)
{fac=1;}

else{

fac=fac*i;
}
}
printf("%d\n",fac);

}


