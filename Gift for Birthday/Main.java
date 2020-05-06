#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int y;
  cin>>y;
  if(y%4==0 && (y%100!=100 || y%400==0))
    cout<<y<<" is a leap year";
  else
    cout<<y<<" is not a leap year";
}