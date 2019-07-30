#include<stdio.h>
int main()
{
  int n,i,e1,e2,e1index=-1,e2index=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
}
  scanf("%d%d",&e1,&e2);
  for(i=0;i<n;i++)
  {
    if(e1==a[i] && e1index==-1)
    {
      e1index=i;
    }
    if(e2==a[i] && e2index==-1)
    {
      e2index=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d ",e1index,e2index);
  return 0;
}
