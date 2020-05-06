#include<iostream>
#include<math.h>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int r,sum=0,count=0;
  int x=n;
  while(x>0)
  {
    count++;
    x=x/10;
  }
  int q=count;
  x=n;
  while(count)
  {
    r=x%10;
    sum=sum+pow(r,q);
    x/=10;
    count--;
  }
  if(n==sum)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}