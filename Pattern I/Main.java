#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  for(i=0;i<4;i++)
  {
    for(j=0;j<=i;j++)
    {
      cout<<n;
    }
    cout<<"\n";
    n+=1;
  }
  
  for(i=4;i>0;i--)
  {
    n-=1;
    for(j=i;j>0;j--)
    {
      cout<<n;
    }
    cout<<"\n";
  }
}