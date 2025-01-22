#include <iostream>
using namespace std;
int main(){
    int numbers[5];
    int sum=0;
    cout<<"Enter any 5 numbers"<<endl;
    for(int x=0; x<5; x++){
        cin>>numbers[x];
        sum += numbers[x];
    }
    cout<<"THE SUM OF THE NUMBERS IS = "<<sum<<endl;
}