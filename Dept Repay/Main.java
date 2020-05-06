#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  cin>>p>>r>>t;
  int si=(p*r*t)/100;
  cout<<si<<"\n";
  cout<<si+p<<"\n";
  float f=(float)si;
  float d=(f*2/100);
  cout<<d<<"\n";
  cout<<si+p-d<<"\n";
}