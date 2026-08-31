#include <stdio.h>

void main() {
    int n, m;
    int total_count = 0;

    printf("Enter n and m: ");
    scanf("%d %d", &n, &m);

    printf("Numbers: ");
    
    for (int num = n; num <= m; num++) {
        int factor_count = 2; // Reset for each new number

        // Inner loop: count factors of 'num'
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                factor_count++;
            }
        }

        // Check condition (e.g., exactly 3 factors for 4 and 9)
        if (factor_count == 3) {
            printf("%d ", num);
            total_count++;
        }
    }

    printf("\nTotal Count = %d\n", total_count);

}
