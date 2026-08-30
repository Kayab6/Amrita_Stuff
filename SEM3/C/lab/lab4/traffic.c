
#include <stdio.h>

void main() {
    char input;

    printf("Enter R, O, or G: ");
    scanf(" %c", &input);

    switch (input) {
        case 'R':
        case 'r':
            printf("STOP\n");
            break;

        case 'O':
        case 'o':
            printf("GET READY\n");
            break;

        case 'G':
        case 'g':
            printf("GO\n");
            break;

        default:
            printf("Invalid input\n");
            break;
    }

    
}
