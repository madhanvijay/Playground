#include<stdio.h>
int main()
{
  int n,sum=0,i;
  scanf("%d",&n);
  while(n!=0)
  {
    sum=sum+(n%10)*pow(2,i);
    n=n/10;
    i++;
  }
  printf("%d",sum);
  return 0;
}