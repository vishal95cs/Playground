#include<iostream>
using namespace std;
int main()
{
  int n,i,flag=0;
  cin>>n;
  if(n<=1)
    flag=1;
  for(i=2;i<=n/2;i++)
  {
    if(n%i==0)
    {
      flag=1;
      break;
    }
  }
  if(flag==0)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}