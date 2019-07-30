#include<stdio.h>
#include<string.h>
int main()
{
  char s[100];
  int len,i,w=1;
  scanf("%[^\n]s",s);
  len=strlen(s);
  for(i=0;i<len;i++)
  {
    if(s[i]!=' ' && s[i+1]==' ')
      w=w+1;
  }
  printf("%d",w);
  return 0;

  
}