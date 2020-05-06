#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k=0;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      k+=i;
      for(int j=k;j>k-i;j--)
    {
      cout<<j;
      if(j!=k-i+1)
        cout<<"*";
    }
    }
    else
    {
      
      for(int j=1;j<=i;j++)
      {
        k++;
        cout<<k;
        if(j!=i)
          cout<<"*";
        
      }
    }
    cout<<"\n";
  }
}