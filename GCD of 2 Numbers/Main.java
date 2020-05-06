#include<iostream>
using namespace std;
int gcd(int x,int y,int small)
{
  int result;
  if(x%small==0 && y%small==0)
  {
    result=small;
    return result;
  }
  return (gcd(x,y,small-1));
}
int main()
{
  //Type your code here.
  int a,b,small;
  cin>>a>>b;
   if(a<b)
    small=a;
  else
    small=b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b,small);
}