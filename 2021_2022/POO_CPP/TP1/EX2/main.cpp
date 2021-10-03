#include <iostream>
#include <string>

using namespace std;

int main()
{
    int i=0,val,minimum;
    do{
            cout << "Donner un entier:" << endl;
            cin >> val;

            if(i==0 || val<minimum)
                minimum = val;
            i++;

    }while(i<10);
    cout << "La valeur minimale de cette serie est " << minimum << endl;
    return 0;
}
