#include <iostream>

using namespace std;

int main(){
	ab:
	for(int i = 0; i<10; i++){
		for(int j = 0; i<10; j++){
			if(i == 5)goto ab;
		}
		cout << " i = " << i << endl;
	}
}
