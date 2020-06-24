import java.util.Scanner;

public class SecLastDigit 
{
static int lDigit(int num)
{
	int digit=0;
	digit=(num%100)/10;
	return digit;
}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=s.nextInt();
	System.out.println("THe last digit of "+num+" is :"+lDigit(num));
}
}
