#include <iostream>
#include <string>

using namespace std;

int suite(int n){
    return n==0?3:3*suite(n-1)+4;
}
int main()
{
    int val;
    do{
            cout << "Donner un entier positif:" << endl;
            cin >> val;
    }while(val < 0 );
    cout << "La suite de terme " << val << " est egale a " << suite(val) << endl;
    return 0;
}
