import java.util.*;
class Hanoi
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number;
System.out.println("No.of disks:");
number=sc.nextInt();
fun('A','B','C',number);
}
static void fun(char a,char b,char c,int n)
{
if(n<=0)
System.out.println("Illegal number of disks");
if(n==1)
System.out.println("Move disk from "+a+" to "+c);
if(n>1)
{
fun(a,c,b,(n-1));
fun(a,b,c,1);
fun(b,a,c,(n-1));
}
}
}
