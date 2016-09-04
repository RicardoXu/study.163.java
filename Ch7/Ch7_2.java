import java.util.Scanner;

class Display {
	private int value = 0;
	private int limit = 1;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void setTime(int value) {
		this.value = value;
	}
	
	public void increase() {
		value++;
		if (value == limit) {
			value = 0;
		}
	}
	public int getValue() {
		return value;
	}
}

class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public Clock(int hour, int minute, int second) {
		this.hour.setTime(hour);
		this.minute.setTime(minute);
		this.second.setTime(second);
	}
	
	public void tick() {
		second.increase();
		if (second.getValue() == 0) {
			minute.increase();
			if (minute.getValue() == 0) {
				hour.increase();
			}
		}
	}
    
	public String toString() {
		String str = new String();
		return str.format("%02d:%02d:%02d", this.hour.getValue(), this.minute.getValue(), this.second.getValue());
	}
}

public class Main {
	
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}