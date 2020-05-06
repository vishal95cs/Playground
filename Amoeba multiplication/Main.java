#include<iostream>
using namespace std;
int main()
{
  int n,r,count=0;
  cin>>n;
  int a=0,b=1;
  for(int i=0;i<n-1;i++)
  {
    r=a+b;
    a=b;
    b=r;
  }
  cout<<a;
}