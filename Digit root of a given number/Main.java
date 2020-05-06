#include<iostream>
using namespace std;
int root(int n)
{
  int sum=0;
  if(n<=9)
    return n;
  else
  {
    while(n>0)
    {
      sum+=(n%10);
      n/=10;
    }
    return (root(sum));
  }
}
int main()
{
  int n;
  cin>>n;
  cout<<root(n);
}