#include<iostream>
using namespace std;
int main()
{
  int x,y,c;
  cout<<"Enter first number : Enter second number : Menu\n";
  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>x>>y>>c;
  switch(c)
  {
    case 1:
      cout<<x+y;
      break;
    case 2:
      cout<<x-y;
      break;
    case 3:
      cout<<x*y;
      break;
    case 4:
      cout<<x/y;
      break;
    case 5:
      cout<<x%y;
      break;
    default:
      cout<<"Invalid operation";
      break;
  }
}