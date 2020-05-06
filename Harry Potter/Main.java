#include<iostream>
using namespace std;
int main()
{
    char arr[50];
    cin>>arr;
    string str,str1;
    str=str+arr[0];
    str1=str1+arr[3];
    cout<<stoi(str)+stoi(str1);
}