#include<stdio.h>
int main()
{
  int i,a,b;
  scanf("%d",&a);
  for(i=0;i<a;i++)
  {
    if(i%2==0)
    {
      b=i;
    }
    else
    {
      b=b/2;
    }
  }
  printf("%d",b);
  return 0;
	
}