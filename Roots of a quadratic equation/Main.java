#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c;
  float d,e,f,real,img;
  scanf("%f%f%f",&a,&b,&c);
  d=(b*b)-(4*a*c);
  if(d>0)
  {
  e=(-b+sqrt(d))/(2*a);
  f=(-b-sqrt(d))/(2*a);
  printf("root1 = %.2f  root2 = %.2f",e,f);
  }
  else if(d==0)
  {
  e=(-b)/(2*a);
  f=(-b)/(2*a);
  printf("root1 = %.2f  root2 = %.2f",e,f);
  }
  else
  {
  real = (-b/(2*a));
  img = sqrt(-d)/(2*a);
  printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,img,real,img);
  } 
  return 0;
}