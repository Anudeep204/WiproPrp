package iffII;
public class Thriteen 
{
public static void main(String[] args) 
{
for(int i=10;i<=99;i++)
{
boolean val=true;
for(int j=2;j<i;j++)
{
if(i%j==0)
{	
val=false;
break;
}
}
if(val)
{
System.out.print(i+" ");
}
}
}
}
