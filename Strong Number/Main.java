#include <stdio.h>
int main()
{
  int a,b,fact,sum=0;
  scanf("%d",&a);
  int t=a;
  while(a>0)
  {
    b=a%10;
    fact=1;
     for(int i=1;i<=b;i++)
  {
    fact=fact*i;
  }
    sum=sum+fact;
    a=a/10;
  }
  if(t==sum)
    printf("Yes");
  else
    printf("No");
	return 0;
}