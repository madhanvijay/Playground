#include <stdio.h>
#include<math.h>
int main()
{
  int n,count=0;
  scanf("%d",&n);
  int t=n;
  int a=n;
  while(n>0)
  {
    count=count+1;
    n=n/10;
  }
  int b,sum=0;
  while(t>0)
  {
    b=t%10;
    sum=sum+pow(b,count);
    t=t/10;
  }
  if(sum==a)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}