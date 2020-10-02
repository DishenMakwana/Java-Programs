import java.util.*;
class test
{
  int a,b;
  test(int i,int j)
  {
    a=i;
    b=j;
  }
  void swap(test o) //constructor as parameter
  {
    int temp=o.a;
    o.a=o.b;
    o.b=temp;
  }
}
public class testc
{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    test ob=new test(x,y);
    System.out.println("before :"+ob.a+" "+ob.b);
    ob.swap(ob); //pass by object
    System.out.println("after :"+ob.a+" "+ob.b);
  }
}