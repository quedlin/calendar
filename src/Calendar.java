
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Calendar {

	public static void main(String[] args) {
				
		//The input will be coming from a String so..
		String inputYear = "2018";
		int theYear = Integer.parseInt(inputYear); //TODO: think up of a better name later
		
		List<DateData> dayDataList = new ArrayList<DateData>();
		
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		//SimpleDateFormat formatter=new SimpleDateFormat("yyy-MM-dd");
    	GregorianCalendar cal = new GregorianCalendar();
    	int year=theYear;
    	int total=365;
      	cal.set(GregorianCalendar.YEAR, year);
    	if (cal.isLeapYear(year)) {
    		total++;
	    }
	 
	    for(int d=1; d<=total; d++) {
	    	cal.set(GregorianCalendar.DAY_OF_YEAR, d);
	    	Date date=cal.getTime();
	    	//System.out.println(d+" "+formatter.format(date));
	    	dayDataList.add(new DateData((GregorianCalendar) cal.clone(), (d+".")));
	    }
		
		for (int i=0; i<dayDataList.size(); i++) {
			System.out.println(dayDataList.get(i).toString());
		}
		
		
		
	}
	

}


