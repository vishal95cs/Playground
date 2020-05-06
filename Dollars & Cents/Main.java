#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,y1,x2,y2;
  cin>>x1>>y1>>x2>>y2;
  int y=y1+y2;
  if(y>=100)
  {
    cout<<(x1+x2+1)<<"\n";
    cout<<(y-100);
  }
  else
  {
    cout<<(x1+x2)<<"\n";
    cout<<y;
  }
}