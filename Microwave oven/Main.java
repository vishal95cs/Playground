#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  float t;
  cin>>t;
  if(n==1)
    cout<<t;
  else if(n==2)
    cout<<(t+(t*50/100));
  else if(n==3)
    cout<<(2*t);
  else
    cout<<"Number of items is more";
}