#include<iostream>
using namespace std;
int main()
{
  int n,x,i,sum=0;
  cin>>n>>x;
  int s=n+x;
  for(i = 1;i<=s/2;i++)
  {
   if(s % i == 0)
     sum = sum + i ;
  } 

 if (sum==s)
    cout<<"They can read the message";
 else
    cout<<"They can't read the message";
  return 0;
}