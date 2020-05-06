#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  // Type your code here
  int n,x=0,y=0,i;
  cin>>n;
  int a[n];
  int *p=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
    cin>>*(p+i);
  for(i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
      x+=1;
    else
      y+=1;
  }
  cout<<y<<"\n"<<x;
  return 0;
}