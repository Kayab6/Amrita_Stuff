#include <stdio.h>

void main() {
    int month, year;

    printf("Enter month number (1-12): ");
    scanf("%d", &month);

    switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            printf("31 days\n");
            break;

        case 4: case 6: case 9: case 11:
            printf("30 days\n");
            break;

        case 2:
            printf("Enter year: ");
            scanf("%d", &year);

            // Leap year condition: divisible by 4 and not 100, OR divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                printf("29 days (Leap Year)\n");
            } else {
                printf("28 days (Non-Leap Year)\n");
            }
            break;

        default:
            printf("Invalid month number.\n");
            break;
    }

}
