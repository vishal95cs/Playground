#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,r,s=0;
  cin>>n;
  while(n>0)
  {
    r=n%10;
    s=s*10+r;
    n=n/10;
  }
  cout<<s;
	return 0;
}