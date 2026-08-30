/*
2) A program to accept a no. & based on the choice to do the following:

i) Display the sum of the digits.
ii) Rev. the no. & display.
iii) Check if the no. is prime.



*/


#include <stdio.h>

void main(){
    int num,i,choice;
    int rem,rev=0,sum=0;

    printf("enter ur number");
    scanf("%d",&num);
    printf("1) Display the sum of the digits\n2) Rev. the no. & display\n3) Check if the no. is prime.");
    scanf("%d",&choice);


    switch(choice){
        case 1:
        //sum of digits
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        printf("%d",sum);
        break;

        case 2:
        // rev the no 
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        printf("%d",rev);

        break;
        case 3:
    
        //prime
        if(num==0 || num==1){
            printf("not prime");
            
        }else{
            int count = 0;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count == 0)
            printf("prime");
            else
            printf("not prime");
        }
        break;

        default:
        printf("invalid")
    }

    

    


}
