#include<stdio.h>
#include<string.h>
int main()
{
  char s[100];
  int n;
  scanf("%[^\n]s",s);
  n=strlen(s);
  printf("%d",n);
  return 0;
}