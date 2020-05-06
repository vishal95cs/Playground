#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n,i;
  int flag=0;
  cin>>r>>c>>n;
  for(i=c+1;i<=2*c;i++)
	{
	    if(n==i)
	    {
          flag=1;
          cout<<"It is a mango tree";
          break;
	    }
	}
  if(flag==0)
  {
    for(i=(c*r-2*c+1);i<=(c*r-c);i++)
	{
	    if(n==i)
	    {
	        flag=2;
	        cout<<"It is a mango tree";
	        break;
	    }
	}
  }
  if(flag==0)
	    cout<<"It is not a mango tree";
}