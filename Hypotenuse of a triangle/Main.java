#include<stdio.h>
#include<math.h>
int main()
{
  float o,a,h;
  scanf("%f%f",&o,&a);
  h=(o*o)+(a*a);
  h=sqrt(h);
  printf("%.2f",h);
  return 0;
}