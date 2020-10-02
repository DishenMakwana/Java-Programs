import java.util.*;
public class roman 
{
  public static void printRoman(int n) 
  { 
    int num[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
    String str[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
    int i=num.length-1;     
    int x=0;
    while(i>=0) 
    { 
      if(num[i]<=n)
      {
        System.out.print(str[i]);
        n = n - num[i];
      }
      else
      {
        i--;
      }
    }
  } 
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    printRoman(n); 
  } 
}