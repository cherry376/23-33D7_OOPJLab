class ConstExample{
ConstExample(){
System.out.println("Empty constructor");
}
ConstExample(int a){
System.out.println("a value is:"+a);
}
ConstExample(int a,int b){
   System.out.println("a value is:"+a);
   System.out.println("b value is:"+b);
   }
}
class ConstructorOverloading
{
public static void main (String args[])
{
 ConstExample ob1=new ConstExample(28,4);
 ConstExample obj2=new ConstExample(8);
 ConstExample obj3=new ConstExample();
}
}
