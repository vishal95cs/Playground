#include <bits/stdc++.h> 
using namespace std; 
int main()
{
  int a = 121;
  int n;
  cin>>n;
  int curr_term=104;
  
  for (int i = 1; i <= n; i++)
  {
    cout<<a<<" ";
    a=a+curr_term;
    curr_term =curr_term + 32;
  }
  return 0;
}