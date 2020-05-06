#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,x,i,flag=0;;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>x;
  for(i=1;i<n;i++)
  {
    if(x==a[i])
    {
      flag=1;
      cout<<"She passed her exam";
      break;
    }
  }
  if(flag==0)
    cout<<"She failed";
}