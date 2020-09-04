#include<stdio.h> 
#include<stdlib.h>  
 
int main()    

{    

int a,b; 

scanf("%d %d",&a,&b); 

printf("Before swap a=%d b=%d",a,b);       

a=a*b;

b=a/b;    

a=a/b;

printf("\nAfter swap without a third variable a=%d b=%d",a,b);       

return 0;  

}