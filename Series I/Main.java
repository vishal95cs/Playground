#include <bits/stdc++.h> 
using namespace std; 
int main()
{
  float a = 0.5;
  int n;
  cin>>n;
  int curr_term=1;
  for (int i = 1; i <= n; i++)
  {
    cout<<a<<" ";
    a=a+curr_term;
    curr_term =curr_term * 3;
  }
  return 0;
}