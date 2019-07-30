#include<stdio.h>
int main()
{
  int n,a=0,b=1,t,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("%d ",a);
    t=a+b;
    a=b;
    b=t;
  }
  return 0;
}