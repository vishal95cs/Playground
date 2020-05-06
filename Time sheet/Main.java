#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[7],sum=0,i;
  for(i=0;i<7;i++)
  {
      cin>>a[i];
  }
  for(int i=0;i<7;i++)
  {
      sum=sum+a[i];
  }
  int sal=(sum*100)+(50*a[0])+(25*a[6]);
  for(int i=0;i<7;i++)
  {
    if(a[i]>8)
    {
      sal=sal+((a[i]-8)*15);
    }
  }
  cout<<sal;
}