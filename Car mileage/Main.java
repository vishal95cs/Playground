#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil;
  cin>>mil;
  int l,d;
  cin>>l>>d;
  if(mil>=((float)d/l))
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}