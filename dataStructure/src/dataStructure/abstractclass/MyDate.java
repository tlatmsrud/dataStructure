package dataStructure.abstractclass;

public class MyDate {

	public int year;
	public int month;
	public int day;
	
	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public int compareTo( MyDate other ) {
		int thisDate = Integer.parseInt(year + "" + month + "" + day);
		int otherDate = Integer.parseInt(other.year + "" + other.month + "" + other.day);
		
		return (thisDate == otherDate) ? 0 : (thisDate > otherDate) ? 1 : -1;
	}
	
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
