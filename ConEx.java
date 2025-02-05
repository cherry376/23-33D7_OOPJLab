class ConEx{
int i;
int j;
ConEx(){
i=64;
j=43;
}
public void Display(){
   System.out.println("i value:"+i);
   System.out.println("j value:"+j);
}
public static void main(String[] args){
    ConEx obj1=new ConEx();
    obj1.Display();
   }
}
