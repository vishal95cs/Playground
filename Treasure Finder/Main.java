#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,hcf,i,pro;
  cin>>a>>b>>c;
  if((a>b && a<c) || (a>c && a<b))
  {
  cout<<"The treasure is in box which has number "<<a<<"\n";
  }
   if((b>a && b<c) || (b>c && b<a))
  {
  cout<<"The treasure is in box which has number "<<b<<"\n";
  }
   if((c>a && c<b) || (c>b && c<a))
  {
  cout<<"The treasure is in box which has number "<<c<<"\n";
  }
  pro=a*b*c;
  for(i=2;i<=pro;i++)
  {
  if(a%i==0 && b%i==0 && c%i==0)
  {
   hcf=i;
   break;
  }}
  if(hcf==0)
 cout<<"The code to open the box is 1"<<"\n";
  else
    cout<<"The code to open the box is "<<hcf<<"\n";
  
}