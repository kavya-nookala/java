class prime
{
public static void main(String args[])
{
int n,c,i,j;
n=Integer.parseInt(args[0]);
System.out.println("prime numbers are:");
for(i=1;i<=n;i++)
{
c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
c++;
}
if(c==2)
System.out.println(i);
}
}
}
