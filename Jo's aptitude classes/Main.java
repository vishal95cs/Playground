#include<iostream>
using namespace std;
int main()
{
  int a,b,c,gcd,result;
  cin>>a>>b>>c>>gcd;
  int small;
  if(a<b&&a<c)
    small=a;
  else if(b<a&&b<c)
    small=b;
  else
    small=c;
  while(small)
  {
    if(a%small==0&&b%small==0&&c%small==0)
    {
      result=small;
      break;
    }
    small--;
  }
  if(result==gcd)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}