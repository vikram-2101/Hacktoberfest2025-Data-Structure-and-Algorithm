#include <stdio.h>
int main () {
//     int i=1;
//    int sum=0;
//    for( ;i<4 ;)
//    sum +=i++;
//    printf("sum = %d\n",sum);
// for(int m1 =1;  m1<=10; m1++)
// {
//     for(int m2 =1; m2<=10; m2++){
//         printf("%d\n",m1*m2);
//     }
// }
// int a=0,b=1;

// for(int i=0; i<10; i++)
// {
    
//  int c=a+b;
//  a=b;
//  b=c;
//     printf(" %d", c);
// 
// int x = 2,  y = 5;
// (x>y)? printf("%d",x):printf("%d",y);
// displayline();
// sum();
// }
// void displayline() {
//     for(int i = 0; i <10; i++) {
//         printf("*");
// }
// }
// void sum() {
//     int a = 0, b = 0;
//     int sum= a+b;
//     printf("%d",sum);
// }
// int Div(int a, int b) {
//     return(a/b);
// }
#include <stdio.h>

int main() {
    int rows, cols;

    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    printf("Enter the number of columns: ");
    scanf("%d", &cols);

    // Declare the original matrix and transpose matrix
    int matrix[rows][cols];
    int transpose[cols][rows];

    printf("Enter the elements of the matrix:\n");

    // Input the elements into the original matrix
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    printf("Original Matrix:\n");

    // Print the original matrix in matrix format
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }

    // Calculate the transpose of the matrix
    for (int i = 0; i < cols; i++) {
        for (int j = 0; j < rows; j++) {
            transpose[i][j] = matrix[j][i];
        }
    }

    printf("Transpose Matrix:\n");

    // Print the transpose matrix in matrix format
    for (int i = 0; i < cols; i++) {
        for (int j = 0; j < rows; j++) {
            printf("%d ", transpose[i][j]);
        }
        printf("\n");
    }

    return 0;
}
