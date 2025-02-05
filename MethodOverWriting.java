public class MethodOverWriting{
public double sub( double a,double b)
{
return a-b;
}
public  double sub( int a,int b,double c){
return a-b-c;
}
public int  sub(int a,int b){
return a-b;
}
public static void main(String[] args)
{
MethodOverWriting obj=new MethodOverWriting();
System.out.println(" subtraction of 10.9 and 6.8:"+obj. sub(6.8,10));
System.out.println(" subtraction of 2,3 and 7.9:"+obj. sub(2,3,7.9));
System.out.println(" subtraction of 15 and 6:"+obj. sub(15,6));
}}
