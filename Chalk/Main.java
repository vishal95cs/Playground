#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  float n;
  cin>>n;
  float s=sqrt(n);
  float sum=n;
  while(n>1)
  {
    n=n/s;
    sum=sum+n;
  }
  cout<<int(sum);
  return 0;
}