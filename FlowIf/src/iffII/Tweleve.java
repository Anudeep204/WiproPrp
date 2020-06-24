package iffII;
import java.util.*;
public class Tweleve 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
s.close();
boolean val=false;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
System.out.println("Not a Prime");
val=true;
break;
}
}
if(!val)
	System.out.println("Its a Prime");
}
}

