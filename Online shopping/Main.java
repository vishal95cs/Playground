#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs;
  int sa,sd,ss;
  int aa,ad,as;
  cin>>fa>>fd>>fs;
  cin>>sa>>sd>>ss;
  cin>>aa>>ad>>as;
  int flip=fa-(fa*fd/100)+fs;
  int snap=sa-(sa*sd/100)+ss;
  int amaz=aa-(aa*ad/100)+as;
  cout<<"In Flipkart Rs."<<flip<<"\n";
  cout<<"In Snapdeal Rs."<<snap<<"\n";
  cout<<"In Amazon Rs."<<amaz<<"\n";
  if (flip <= snap && flip <= amaz) 
        cout <<"He will prefer Flipkart"; 
  
    else if (snap <= flip && snap <= amaz) 
        cout <<"He will prefer Snapdeal"; 
  
    else
        cout <<"He will prefer Amazon";
}