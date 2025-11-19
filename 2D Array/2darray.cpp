#include <iostream>
#include <string>
using namespace std;


int main(){
    
    // 2D Array

    int rows = 2;
    int cols = 2;
    
    // Matrix 1
    int M1[rows][cols] = {
        {1, 2}, 
        {3, 4}
    };

    // Matrix 2
    int M2[rows][cols] = {
        {3, 4},
        {5, 6}
    };

    // Product of the matrices would be stored in this matrix.
    int M[rows][cols];

    M[0][0] =   M1[0][0] * M2[0][0] + M1[0][1] * M2[1][0] ;
    M[0][1] =   M1[0][0] * M2[0][1] + M1[0][1] * M2[1][1] ;
    M[1][0] =   M1[1][0] * M2[0][0] + M1[1][1] * M2[1][0] ;
    M[1][1] =   M1[1][0] * M2[0][1] + M1[1][1] * M2[1][1] ;


    // Printing the Product of the two arrays.
    for (int i = 0; i < rows; i++){

        for(int j = 0; j < cols; j++){

            cout<< M[i][j] << "\t";
        }

        cout<< endl ;
    }
    
    return 0;

}