#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  cin>>age;
  float time;
  cin>>time;
  float x=13.3;
  if(age>13)
  {
    if(time==x)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  else
  {
    if(time==x)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
}