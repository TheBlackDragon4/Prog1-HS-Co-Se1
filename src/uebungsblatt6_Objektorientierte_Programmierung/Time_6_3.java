package uebungsblatt6_Objektorientierte_Programmierung;

import java.text.DecimalFormat;

public class Time_6_3 {

	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// Time constructor initializes each instance variable
	// to zero. Ensures that Time object starts in a
	// consistent state.
	public Time_6_3() {
		setTime(0, 0, 0);
	}

	// Time constructor: hour supplied, minute and second
	// defaulted to 0
	public Time_6_3(int h) {
		setTime(h, 0, 0);
	}

	// Time constructor: hour and minute supplied, second
	// defaulted to 0
	public Time_6_3(int h, int m) {
		setTime(h, m, 0);
	}

	// Time constructor: hour, minute and second supplied
	public Time_6_3(int h, int m, int s) {
		setTime(h, m, s);
	}

	// Time constructor: another Time object supplied
	public Time_6_3(Time_6_3 time) {
		setTime(time.getHour(), time.getMinute(), time.getSecond());
	}

	// Set Methods
	// Set a new time value using universal time. Perform
	// validity checks on data. Set invalid values to zero.
	public void setTime(int h, int m, int s) {
		setHour(h); // set the hour
		setMinute(m); // set the minute
		setSecond(s); // set the second
	}

	// validate and set hour
	public void setHour(int h) {
		hour = ((h >= 0 && h < 24) ? h : 0);
	}

	// validate and set minute
	public void setMinute(int m) {
		minute = ((m >= 0 && m < 60) ? m : 0);
	}

	// validate and set second
	public void setSecond(int s) {
		second = ((s >= 0 && s < 60) ? s : 0);
	}

	// Get Methods
	// get hour value
	public int getHour() {
		return hour;
	}

	// get minute value
	public int getMinute() {
		return minute;
	}

	// get second value
	public int getSecond() {
		return second;
	}

	public void tick() {
		// to do
		setSecond(second + 1);
		
		if(second == 0) {
			incrementMinute();
		}
	}

	public void incrementMinute() {
		// to do
		setMinute(minute + 1);

		if (minute == 0) {
			incrementHour();
		}
	}

	public void incrementHour() {
		// to do
		setHour(hour + 1);
	}

	// convert to String in standard-time format
	public String toString() {
		DecimalFormat twoDigits = new DecimalFormat("00");

		return ((getHour() == 12 || getHour() == 0) ? 12 : getHour() % 12) + ":" + twoDigits.format(getMinute()) + ":"
				+ twoDigits.format(getSecond()) + (getHour() < 12 ? " AM" : " PM");
	}
}
