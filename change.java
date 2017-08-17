import.java.*;
class ar
{ 
int sum=0;
Public static  void main(String[] args)
Scanner s = new Scanner(System.in);
int[] []mat1= new int [3][3];
int [][] mat2=new int [3][3];
int [][] tot=new int [3][3]; 
System.out.println("enter number matrix value");

for(int i=0;i<3;i++)
{
for(int j=o;j<3;j++)
{
mat1[][]=s.nextint();
}
}                                 //matrix 1 over
for(int i=0;i<3;i++)
{
for(int j=o;j<3;j++)
{
mat2[][]=s.nextint();
}
}                                 //matrix 2 over
for(int i=0;i<3;i++)
{
for(int j=o;j<3;j++)
{
tot[][]=mat1[i][j]+mat2[i][j];
}
}                                 //total of matrix over
for(int i=0;i<3;i++)
{
for(int j=o;j<3;j++)
{
System.out.println(tot[i][j]);   //display of array
}
}
