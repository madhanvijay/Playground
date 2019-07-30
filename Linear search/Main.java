#include<stdio.h>
int main()
{
  int a[10],i,n,b,count,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d ",&a[i]);
  }
  scanf("%d",&b);
  for(i=0;i<n;i++)
  {
    if(a[i]==b)
    {
      count=i+1;
      c=1;
      break;
    }
  }
  if(c==1)
    printf("%d",count);
  else
    printf("%d isn't present in the array.",b);
  
  return 0;
}