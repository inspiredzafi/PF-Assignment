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
    int MP[rows][cols];         // MP - Matrix storing the product of M1 and M2.

    MP[0][1] =   M1[0][0] * M2[0][1] + M1[0][1] * M2[1][1] ;
    MP[0][0] =   M1[0][0] * M2[0][0] + M1[0][1] * M2[1][0] ;
    MP[1][0] =   M1[1][0] * M2[0][0] + M1[1][1] * M2[1][0] ;
    MP[1][1] =   M1[1][0] * M2[0][1] + M1[1][1] * M2[1][1] ;


    
    int MA[rows][cols];         // MA - Matrix storing the Addition of M1 and M2.
    int MS[rows][cols];         // MS - Matrix storing the Subtraction of M1 and M2.


    // MA[0][0] = M1[0][0] + M2[0][0] ;
    // MA[0][1] = M1[0][1] + M2[0][1] ;
    // MA[1][0] = M1[1][0] + M2[1][0] ;
    // MA[1][1] = M1[1][1] + M2[1][1] ;



    // I'll be performing the same operation using a loop to make it more simple
    

    // Addition of two matrices
    for(int i = 0; i < rows; i++){

        for(int j = 0; j < cols; j++){

            MA[i][j] = M1[i][j] + M2[i][j] ;
        }
    }

    // Subtraction of two matrices
    for(int i = 0; i < rows; i++){

        for(int j = 0; j < cols; j++){

            MS[i][j] = M1[i][j] - M2[i][j] ;
        }
    }


    /*
    Printing the Resulting Matrices. i.e. MP, MA, MS

    MP - Product of M1, M2
    MA - Addition of M1, M2
    MS - Subtraction of M1, M2
    */ 

    // Printing the Matrix MP
    cout<< "The product of the arrays is: " << endl;
    for (int i = 0; i < rows; i++){

        for(int j = 0; j < cols; j++){

            cout<< MP[i][j] << "\t";
        }

        cout<< endl ;
    }

    // Printing the Matrix MA
    cout<< "The Addition of the arrays is: " << endl;
    for (int i = 0; i < rows; i++){

        for(int j = 0; j < cols; j++){

            cout<< MA[i][j] << "\t";
        }

        cout<< endl ;
    }

    // Printing the Matrix MS
    cout<< "The Subtraction of the arrays is: " << endl;
    for (int i = 0; i < rows; i++){

        for(int j = 0; j < cols; j++){

            cout<< MS[i][j] << "\t";
        }

        cout<< endl ;
    }





    
    return 0;

}