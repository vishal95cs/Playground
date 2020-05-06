#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,res;
  cin>>x>>y;
  
  if(x>20 && y<=20)
    res=100+y-x;
  else
    res=y-x;
  if(res>=0)
    cout<<res;
  else
    cout<<100+y-x;
}