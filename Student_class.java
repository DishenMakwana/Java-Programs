import java.util.*;
public class Student{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[][][] a = new int[5][3][2];
         int[] total = new int[5];
        System.out.println("Enter Marks");
        for(int i=0;i<5;i++){
            System.out.println("Enter Marks of Student"+(i+1));
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++)
                {
                    a[i][j][k] = inp.nextInt();
                    total[i] += a[i][j][k];
                    }
            }
            System.out.println("Score of Student "+(i+1)+" is: "+total[i]);
        }        

        int[] arr=new int[5];
        for(int n=0;n<5;n++)
            arr[n]=total[n];

        Arrays.sort(arr);
        int j=1;
        for(int i=4;i>=0;i--){
            System.out.println("\n"+"rank    : "+j);
            for(int k=0;k<5;k++){
                if(total[k]==arr[i]){
                    System.out.println("Student : "+(k+1));
                    break;
                }
            }
            System.out.println("total   : "+arr[i]);    
            j++;                
        }
     }
}