#include <bits/stdc++.h> 
using namespace std; 
int main()
{
  int a = 6;
  int n;
  cin>>n;
  int curr_term=5;
  
  for (int i = 1; i <= n; i++)
  {
    cout<<a<<" ";
    a=a+curr_term;
    curr_term =curr_term + 5;
  }
  return 0;
}