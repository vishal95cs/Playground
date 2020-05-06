#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
//Type your code here
  string str;
  getline(cin,str);
  for (auto rit=str.crbegin(); rit!=str.crend(); ++rit)
    std::cout << *rit;
  
}