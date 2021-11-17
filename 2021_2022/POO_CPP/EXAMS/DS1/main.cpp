#include <iostream>
#include "Robot.h"
using namespace std;

int main()
{
    cout << "--------- The Transformers ---------" << endl;
    Robot robot1("Optimus Prime",2,3,25);
    robot1.afficher();
    robot1.deplacer(3,7);
    robot1.afficher();
    Robot robot2("Fallen");
    robot2.afficher();

    robot1.tuer(robot2);
    return 0;
}
