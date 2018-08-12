package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Test;

public class ClockValidatorTest {


	@Test
	public void testHourValidation() {
		Assert.assertFalse(BerlinClockValidator.validateTimeFormat("72:00:00"));
		Assert.assertTrue(BerlinClockValidator.validateTimeFormat("23:00:00"));
	}
	
	@Test
	public void testMinuteValidation() {
		Assert.assertFalse(BerlinClockValidator.validateTimeFormat("00:72:00"));
		Assert.assertTrue(BerlinClockValidator.validateTimeFormat("00:28:00"));
	}
	
	@Test
	public void testSecondValidation() {
		Assert.assertFalse(BerlinClockValidator.validateTimeFormat("00:00:70"));
		Assert.assertTrue(BerlinClockValidator.validateTimeFormat("00:00:06"));
	}
	
	@Test
	public void testFormatValidation() {
		Assert.assertFalse(BerlinClockValidator.validateTimeFormat("72-00-00"));
		Assert.assertTrue(BerlinClockValidator.validateTimeFormat("22:34:20"));
	}
	

}
