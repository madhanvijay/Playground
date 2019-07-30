#include<stdio.h>
#define pi 3.14
int main()
{
  int d;
  float area;
  scanf("%d",&d);
  area=pi*(d/2.0)*(d/2.0);
  printf("%.2f",area);
  return 0;
}