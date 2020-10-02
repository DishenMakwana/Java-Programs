import java.util.*;
import java.util.Date;

class javacalender
{
	public static void main(String args[])
	{
		Date date1=new Date();
		System.out.println("1:"+ date1);
		
		/*Calendar calendar1= new GregorianCalendar();
		display(calender1);*/
		
		Calendar calendar2= new GregorianCalendar(2019,7,7);
		display(calendar2);
		
		Calendar calendar3= new GregorianCalendar(2019,7,7,210,2);
		display(calendar3);
	
		
	}
	
	static void display(Calendar calendar)
	{
		System.out.println("year:"+ calendar.get(Calendar.YEAR));
		System.out.println("month:"+ calendar.get(Calendar.MONTH));
		System.out.println("date:"+ calendar.get(Calendar.DATE));
		
		
		System.out.println("HOUR:"+ calendar.get(Calendar.HOUR));
		if(calendar.get(Calendar.AM_PM)==1)
		    System.out.println("p.m.");
		else
		    System.out.println("a.m.");
		    
		    
		System.out.println("hour(24):"+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE:"+ calendar.get(Calendar.MINUTE));
		
		System.out.println("day of week:");
		switch (calendar.get(Calendar.DAY_OF_WEEK))
		{
			case 1:System.out.println("sunday");break;
			case 2:System.out.println("monday");break;
			case 3:System.out.println("tuesday");break;
			case 4:System.out.println("wednesday");break;
			case 5:System.out.println("thursday");break;
			case 6:System.out.println("friday");break;
			case 7:System.out.println("saturday");break;
			
		}
		
		
	}
}

    