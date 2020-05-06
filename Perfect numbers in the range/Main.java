#include<iostream>
using namespace std;
int main()
{
  int n,x,i,sum=0;
  cin>>n>>x;
  for(int j=n;j<=x;j++)
  {
    sum=0;
    for(i = 1;i<=j/2;i++)
      {        
        if(j % i == 0)
          sum = sum + i;
      } 
	if (sum==j)
      cout<<j<<" ";
  }
  return 0;
}