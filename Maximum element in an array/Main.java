#include<stdio.h>
int main()
{
  int n,a[100],i,b,location=1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  b=a[0];
  for(i=1;i<n;i++)
  {
    if(a[i]>b)
    {
      b=a[i];
      location=i+1;
    }
  }
  printf("%d",b);
  return 0;
}
