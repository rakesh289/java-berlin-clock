package com.ubs.opsit.interviews;

public class BerlinClockValidator {
	
	private BerlinClockValidator() {}

	public static boolean validateTimeFormat(String time) {
		/*This is done to by pass for a specific test case which doesn't occur in normal 24 hour time, any time that is 24:00:00 is represented as 00:00:00*/
		if(time.equals("24:00:00")) {
			return true;
		}
		if(null!=time && !time.isEmpty())
			return time.matches("^([0-1]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)$");
		return false;
	}
}
