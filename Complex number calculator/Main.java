#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  switch(n)
  {
    case 1:
      cout<<a+c;
      if(b+d>=0)
        cout<<"+"<<b+d<<"i";
      else
        cout<<b+d<<"i";
      break;
    case 2:
      cout<<a-c;
      if(b-d>=0)
        cout<<"+"<<b-d<<"i";
      else
        cout<<b-d<<"i";
      break;
    case 3:
      cout<<((a*c)-(b*d));
      if(((a*d)+(b*c))>=0)
        cout<<"+"<<((a*d)+(b*c))<<"i";
      else
        cout<<((a*d)+(b*c))<<"i";
      break;
    default:
      cout<<"Invalid choice";
  }
  
}