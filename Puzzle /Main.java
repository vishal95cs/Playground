#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c,i,j;
  cin>>r>>c;
  int a1[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a1[i][j];
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
      cout<<a1[j][i]<<" ";
    cout<<"\n";
  }
}