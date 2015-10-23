package time;

public class Time {
	//initiation int hour as private
	private int hour;
	//initiation int minute as private
	private int minute;
	//initiation int second as private
	private int second;
	
	//method Show() to print the time
	public void Show(){
		System.out.println("The time is "+hour+":"+minute+":"+second+" am");
	} 
	//method setHour() to set the value of hour
	public void setHour(int h) {
		hour = h;
	}
	//method setMinute() to set the value of minute
	public void setMinute(int m) {
		this.minute = m;
	}
	//method setSecond to set the value of second
	public void setSecond(int s) {
		this.second = s;
	}
	//method getHour to return hour
	public int getHour() {
		return hour;
	}
	//method getSecond to return minute
	public int getMinute() {
		return minute;
	}
	//method getSecond to return second
	public int getSecond() {
		return second;
	}
}
