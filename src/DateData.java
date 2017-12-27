import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateData {
	private GregorianCalendar date;
	private String info;
	private static SimpleDateFormat formatter;
	   
	/**
	 * @param date
	 * @param info
	 */
	public DateData(GregorianCalendar date, String info) {
		super();
		this.date = date;
		this.info = info;
		formatter=new SimpleDateFormat("yyy-MM-dd");
	}
	/**
	 * @return the date
	 */
	public GregorianCalendar getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String toString() {		
		 Date date=this.getDate().getTime();
         return ""+formatter.format(date) + " : " + this.getInfo();
	}
}
