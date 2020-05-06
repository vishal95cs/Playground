#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,a,c;
  cin>>w>>a>>c;
  int total=(75*a)+(30*c);
  if(total<=w)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";

}