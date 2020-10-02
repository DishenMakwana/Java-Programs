import java.util.*;
class circle
{ 
  double r=1;
  static int c=0;
  circle(double r1)    
  {  
      r=r1;
      c +=1;
  } 
  circle() { c +=1; }
    void setr()
    {
      Scanner sc=new Scanner(System.in); 
      double r2=sc.nextDouble();
      r=r2; 
    }
    double setdata() 
    {
      double ans=(r * r * 3.1428); 
      return ans;
    } 
} 
public class testcircle
{
  public static void main(String args[]) 
  {
    circle c1=new circle(20);
    System.out.println("c1: "+ c1.setdata()); 
    
    circle c2=new circle(); 
    System.out.println("c2: "+ c2.setdata());
    
    circle c3=new circle(); 
    c3.setr();
    System.out.println("c3: "+ c3.setdata());
    
    System.out.println("no of Obj: "+c3.c);
  }
}