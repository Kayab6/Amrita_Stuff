#include <stdio.h>

void main() {
    char ch;

    printf("Enter an alphabet: ");
    scanf(" %c", &ch);

    // Validate alphabet range
    if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
        printf("'%c' is not an alphabet letter.\n", ch);
        return 0;
    }

    // Convert uppercase to lowercase manually
    if (ch >= 'A' && ch <= 'Z') {
        ch = ch + 32; // e.g. 'A' (65) + 32 = 'a' (97)
    }
    //Lowercase ASCII = Uppercase ASCII + 32
    // Check only lowercase
    switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            printf("The letter is a vowel.\n");
            break;

        default:
            printf("The letter is a consonant.\n");
            break;
    }

    ;
}
