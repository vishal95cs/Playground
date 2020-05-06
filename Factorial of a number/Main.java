#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,pdt=1;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    pdt=pdt*i;
  }
  cout<<pdt;
}