# 6 th august 

| S.No. | Problem |
|---|---|
| 1 | `1 + 2² + 3² + 4² + ..... + m²` |
| 2 | `1 + 2² + 3³ + 4⁴ + ..... + mᵐ` |
| 3 | `1 + 2² + 3 + 4² + .....` |
| 4 | Print the last digit of a given number |
| 5 | Count the number of digits in a number |
| 6 | Sum of digits of a given number |
| 7 | Armstrong Number |

## 1) `1 + 2² + 3² + 4² + ..... + m²`

'''

# include <stdio.h>

void main(){
    int i,n;
    int sum_of_sqs=0;

    // we need to find sum of square

    printf("enter n value");
    scanf("%d",&n);

    for(i=1;i<=n;i++){
        sum_of_sqs=sum_of_sqs+i*i;


    }

    printf("%d",sum_of_sqs);


}
// note we cannot define exponentiation in c 

'''




## 2)  2 | `1 + 2² + 3³ + 4⁴ + ..... + mᵐ` |

'''

//1 + 2² + 3³ + 4⁴ + ..... + mᵐ
# include <stdio.h>
void main(){
    int i,j,n;
    int sum=0;
    // put int pow=1 inside outer loop because pow must be reset for every new i.
    // we need to find sum of square
    printf("enter n value");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        int pow=1;
        for(j=1;j<=i;j++){
            pow=pow*i;
        }
        sum=sum+pow;
    }
    printf("%d",sum);
}
// note we cannot define exponentiation in c 

'''



## 3) | 3 | `1 + 2² + 3 + 4² + .....` |

'''
//1 + 2² + 3 + 4² + .....

# include <stdio.h>

void main(){

    int i , n;
    int sum=0;

    printf("enter n value");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        if(i%2==0){
            sum=sum+i*i;
        }
        else{
            sum=sum+i;
        }

    }
    printf("%d", sum);
}

'''


## 4) 

'''


'''

## 2) 

'''


'''



## 2) 

'''


'''


## 2) 

'''


'''
