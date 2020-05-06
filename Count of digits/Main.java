#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,x;
  cin>>n;
  do
  {
    x=x+1;
    n=n/10;
  }while(n>0);
  cout<<x;
}