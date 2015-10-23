package time; 

public class DisplayTime {
	public static void main(String[] args){
		//initiation class Time
		Time time = new Time();
		
		//call method setHour() and give the value, parameters is int
		time.setHour(4);
		//call method setMinute() and give the value, parameters is int
		time.setMinute(23);
		time.setSecond(20);
		
		time.Show();

		//print the time by use method get 
		System.out.println("The time is "+time.getHour()+":"+time.getMinute()+":"+time.getSecond()+" am");
	}
}
