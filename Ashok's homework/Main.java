#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int x,y,i,j;
  cin>>x>>y;
  int a1[x][y],a2[x][y],sum[x][y];
  for(i=0;i<x;i++)
    for(j=0;j<y;j++)
      cin>>a1[i][j];
  for(i=0;i<x;i++)
    for(j=0;j<y;j++)
      cin>>a2[i][j];
  for(i=0;i<x;i++)
    for(j=0;j<y;j++)
      sum[i][j]=a1[i][j]+a2[i][j];
  for(i=0;i<x;i++)
  {
    for(j=0;j<y;j++)
      cout<<sum[i][j]<<" ";
    cout<<"\n";
  }
}