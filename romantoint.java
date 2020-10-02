import java.util.*; 

public class RomanToNumber 
{ 
    public static int value(char r) 
    { 
        if (r == 'I') 
            return 1; 

        if (r == 'V') 
            return 5; 

        if (r == 'X') 
            return 10; 

        if (r == 'L') 
            return 50; 

        if (r == 'C') 
            return 100; 

        if (r == 'D') 
            return 500; 

        if (r == 'M') 
            return 1000; 

        return -1; 
    } 
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        
        String str1=sc.nextLine();
        String str=str1.toUpperCase();
        
        int res = 0; 
       /* for (int i=str.length()-1; i>=0; i--) 
        { 
         
          int s2=value(str.charAt(i));
          if( i > 0 )
          {
          int s1=value(str.charAt(i-1));
          if( s1 < s2 )
          {
            res = res + s2 ;
          }
          else
          {
            res = res + s2 - s1 ;
            i--;
          }
          }
          else
          {
            res = res + s2 ; i--;
          }
        } 
        System.out.println("result :"+res);*/
        
        
        res=0;
        for(int i=0;i<str.length();i++)  
        {
          int s1=value(str.charAt(i));
          if(i < str.length()-1)
          {
            int s2=value(str.charAt(i+1));
            if(s1 >= s2)
            {
              res = res + s1;
            }
            else
            {
              res = res + s2 - s1 ;
              i++;
            }
          }
          else
          {
            res = res + s1 ;
            i++;
          }
        }
        System.out.println("result :"+res); 
    }
    
    
 }