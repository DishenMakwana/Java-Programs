import java.io.*;

class std
{
	public static void main(String args[])
	{
		char name[]={};
		//byte byteAry[]=new byte[20];
		
	//	String str2=new String("I LOVE JAVA");
		String str= "i like java";
		
		
		
			//System.out.println(""+ str1);
			//System.out.println(""+ str2);
			
		System.out.println(""+ str);
		System.out.println(""+ reverceStr(str));
		
		//System.out.println(""+ str1.compareTo(str2));
		//System.out.println(""+ str1.compareToIgnoreCase(str2));
		
		
	}
	
	static String  reverceStr (String str)
	{
		int len=str.length();
		
		byte byteAry[]= new byte[len];
		byteAry=str.getBytes();
		
		for(int i=0,j=len-1;j>len/2;i++,j--)
		{
			byte tmp= byteAry[i];
			byteAry[i]=byteAry[j];
			byteAry[j]=tmp;
		}
		 return new String(byteAry);
	}
}

    