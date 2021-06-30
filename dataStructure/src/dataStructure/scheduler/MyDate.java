package dataStructure.scheduler;

public class MyDate {

	public int year;
	public int month;
	public int day;
	
	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
