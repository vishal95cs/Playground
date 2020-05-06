#include<iostream>
using namespace std;
int main()
{
  int n,r,sum=0;
  cin>>n;
  int x=n;
  while(x>0)
  {
    r=x%10;
    sum=sum+r;
    x=x/10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}