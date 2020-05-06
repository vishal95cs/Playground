#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,r=0;
  cin>>n;
  int x=pow(n,2);
  int count=0,i=n;
  while(i>0)
  {
    count++;
    i/=10;
  }
  int flag=1;
  while(count>0)
  {
    i=x%10;
    r=r+i*flag;
    x=x/10;
    flag*=10;
    count--;
  }
  if(n==(r+x))
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}