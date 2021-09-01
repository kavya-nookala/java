//n.sai kavya    
//19N31A05E4    
//cse c
//09-06-2021
//java programming lab internal 2
//fibanocci series using recursive function

class fib
{
int recursive(int n)
{
if(n==0)
 return (0);
if(n==1)
 return (1);
else
 return(recursive(n-1)+recursive(n-2));
}
}
class fib1
{
public static void main(String args[])
{
int n;
n=Integer.parseInt(args[0]);
fib f=new fib();
System.out.println("the recursion using recursive is"); 
for(int i=0;i<=n;i++)
{
int F1=f.recursive(i);
System.out.println(F1);
}
}
}