#include<stdio.h>
int main()
{
  float r,a,l;
  scanf("%f%f",&r,&a);
  l=(a/360)*2*3.14*r;
  printf("%.2f",l);
  return 0;
}