#include <stdio.h>

int main()
{
    int num, original, digit;
    int count = 0;
    int armstrong = 0;
    int power, i;

    printf("Enter num: ");
    scanf("%d", &num);

    original = num;

    // Count the number of digits
    int temp = num;

    while (temp > 0)
    {
        count++;
        temp = temp / 10;
    }

    // Extract each digit and raise it to count
    temp = num;

    while (temp > 0)
    {
        digit = temp % 10;

        power = 1;

        for (i = 1; i <= count; i++)
        {
            power = power * digit;
        }

        armstrong = armstrong + power;

        temp = temp / 10;
    }

    
    if (armstrong == original)
        printf("%d is an Armstrong number", original);
    else
        printf("%d is not an Armstrong number", original);

    return 0;
}
