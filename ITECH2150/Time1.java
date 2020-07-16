
public class Time1 {
	private int hour;
	private int minute;
	private int second;
	
	public Time1(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void checking (Time1 future) {
		this.hour = future.hour;
	}
	
		public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
}
