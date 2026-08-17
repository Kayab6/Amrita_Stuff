#include <stdio.h>

int main() {
    int n, digit, sum;

    printf("Enter a number: ");
    scanf("%d", &n);

    do {
        sum = 0;

        do {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        } while (n > 0);

        n = sum;

    } while (n >= 10);

    printf("Final digit = %d", n);

    return 0;
}



#include <stdio.h>

int main() {
    int n, digit, sum;

    printf("Enter a number: ");
    scanf("%d", &n);

    while (n >= 10) {
        sum = 0;

        while (n > 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        n = sum;
    }

    printf("Final digit = %d", n);

    return 0;
}
