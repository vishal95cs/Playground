#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,r;
  cin>>n;
  int i=n;
  int count1=0,count2=0;
  while(n>0)
  {
    r=n%10;
    if(r%2==0)
      count1+=r;
    else
      count2+=r;
    n=n/10;
  }
  if(count1==count2)
    cout<<"Yes";
  else
    cout<<"No";
}