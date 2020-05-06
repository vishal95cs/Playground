#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[10],f=0;
  float score=0.0;
  while(cin>>a[f])
    {
        f++;
    }
  for(int i=0;i<f;i++)
  {
    if(a[i]<0)
      score-=1.0;
    else if(a[i]%2==0)
      score-=0.5;
    else
      score+=1.0;
  }
  printf("%.1f",score);
}