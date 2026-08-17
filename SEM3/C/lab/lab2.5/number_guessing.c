#include <stdio.h>

int main() {
    int num, guess;

    num = 73;

    do {
        printf("Enter your guess: ");
        scanf("%d", &guess);

        if (guess > num) {
            printf("HIGH\n");
        }
        else if (guess < num) {
            printf("LOW\n");
        }
        else {
            printf("CORRECT!\n");
        }

    } while (guess != num);

    return 0;
}
