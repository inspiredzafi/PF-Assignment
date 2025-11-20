#include <iostream>
// #include <string>
using namespace std;

int main(){
    int R, G, B;
   cout<< "Enter the rgb color: " ;
   cin>> R >> G >> B ;

   // The logic to convert rgb color to hex is quite simple 😁
   /*
        hexColorCode = # + hex(R) + hex(G) + hex(B) 
   */

    cout<< "#" <<hex << R << G << B << endl;
   


   return 0 ;
}