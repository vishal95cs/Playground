#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a=0;
  int b=1;
  int n,c;
  cin>>n;
  for(int i=0;i<n-1;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<a;
}