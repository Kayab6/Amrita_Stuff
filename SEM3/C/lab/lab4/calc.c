#include <stdio.h>

int main() {
    int a, b;
    char oper;

    printf("# SELECT YOUR OPERATION #\n");
    printf("1) +\n");
    printf("2) -\n");
    printf("3) *\n");
    printf("4) /\n");

    scanf(" %c", &oper);

    printf("Enter first num: ");
    scanf("%d", &a);

    printf("Enter second num: ");
    scanf("%d", &b);

    switch (oper) {
        case '+':
        case '1':
            printf("Result = %d", a + b);
            break;

        case '-':
        case '2':
            printf("Result = %d", a - b);
            break;

        case '*':
        case '3':
            printf("Result = %d", a * b);
            break;

        case '/':
        case '4':
            if (b == 0)
                printf("Cannot divide by zero");
            else
                printf("Result = %d", a / b);
            break;

        default:
            printf("Invalid operation");
    }

    return 0;
}
