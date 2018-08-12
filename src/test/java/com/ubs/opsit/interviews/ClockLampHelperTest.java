package com.ubs.opsit.interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClockLampHelperTest {

	@Test
	public void testHoursFirstRow() {
		assertEquals("Equal","RRRO", ClockLampHelper.HOURS_TOP.getTime("18"));
		assertEquals("Equal","RRRR", ClockLampHelper.HOURS_TOP.getTime("21"));
		
	}
	
	@Test
	public void testHoursSecondRow() {
		assertEquals("Equal","RRRO", ClockLampHelper.HOURS_BOTTOM.getTime("18"));
		assertEquals("Equal","ROOO", ClockLampHelper.HOURS_BOTTOM.getTime("21"));
		assertEquals("ROOO", ClockLampHelper.HOURS_BOTTOM.getTime("21"));
		
	}
	
	@Test
	public void testMinuteFirstRow() {
		assertEquals("Equal","YOOOOOOOOOO", ClockLampHelper.MINUTES_TOP.getTime("6"));
		assertEquals("Equal","YYROOOOOOOO", ClockLampHelper.MINUTES_TOP.getTime("17"));
		
	}
	
	@Test
	public void testMinuteSecondRow() {
		assertEquals("Equal","YYYO", ClockLampHelper.MINUTES_BOTTOM.getTime("18"));
		assertEquals("Equal","YOOO", ClockLampHelper.MINUTES_BOTTOM.getTime("21"));
		
	}
	
	@Test
	public void testSecondsLamp() {
		assertEquals("Equal","Y", ClockLampHelper.SECONDS.getTime("18"));
		assertEquals("Equal","O", ClockLampHelper.SECONDS.getTime("21"));
		
	}

}
