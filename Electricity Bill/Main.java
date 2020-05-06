#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u;
  int total;
  cin>>u;
  if(u<=200)
    total=u*0.5;
  else if(u<=400)
    total=u*0.65+100;
  else if(u<=600)
    total=u*0.8+200;
  else
    total=u*1.25+425;
  cout<<"Rs."<<total;
}