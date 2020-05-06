#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,r;
  cin>>m>>n>>r;
  int x=pow(m,n);
  if(x>=r)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}