package com.ubs.opsit.interviews;

public class BerlinClockConverter implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		if (BerlinClockValidator.validateTimeFormat(aTime)) {
			String[] timeArray = splitTime(aTime);

			return getBerlinTime(timeArray);
		}
		return "Enter a valid time";
	}

	private String getBerlinTime(String[] timeArray) {
		StringBuilder builder = new StringBuilder();

		/* Format time with line seperators to reflect the required output */
		builder.append(ClockLampHelper.SECONDS.getTime(timeArray[2]));
		builder.append(System.lineSeparator());
		builder.append(ClockLampHelper.HOURS_TOP.getTime(timeArray[0]));
		builder.append(System.lineSeparator());
		builder.append(ClockLampHelper.HOURS_BOTTOM.getTime(timeArray[0]));
		builder.append(System.lineSeparator());
		builder.append(ClockLampHelper.MINUTES_TOP.getTime(timeArray[1]));
		builder.append(System.lineSeparator());
		builder.append(ClockLampHelper.MINUTES_BOTTOM.getTime(timeArray[1]));

		return builder.toString();
	}

	private String[] splitTime(String time) {
		return time.split(":");
	}
}
