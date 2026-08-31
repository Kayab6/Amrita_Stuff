/*
2) A program to accept a no. & based on the choice to do the following:

i) Display the sum of the digits.
ii) Rev. the no. & display.
iii) Check if the no. is prime.



*/
 
#include <stdio.h>

int main()
{
    int n, num, choice, i, j;

    printf("Enter how many numbers: ");
    scanf("%d", &n);

    i = 1;

    do
    {
        printf("\nEnter number %d: ", i);
        scanf("%d", &num);

        printf("\n1) Multiplication table");
        printf("\n2) First n multiples");
        printf("\n3) Square");
        printf("\n4) Cube");

        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                for(j = 1; j <= 10; j++)
                {
                    printf("%d x %d = %d\n", num, j, num * j);
                }
                break;

            case 2:
                for(j = 1; j <= n; j++)
                {
                    printf("%d ", num * j);
                }
                printf("\n");
                break;

            case 3:
                printf("Square = %d\n", num * num);
                break;

            case 4:
                printf("Cube = %d\n", num * num * num);
                break;

            default:
                printf("Invalid choice\n");
        }

        i++;

    } while(i <= n);

    return 0;
}
