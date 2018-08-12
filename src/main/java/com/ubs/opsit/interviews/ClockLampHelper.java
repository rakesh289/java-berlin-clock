package com.ubs.opsit.interviews;

public enum ClockLampHelper {
	HOURS_TOP {
		@Override
		public String getTime(String time) {
			int target = Integer.parseInt(time);
			char[] replaceArray = {'R','R'};
			return formatToBerlinLamp('O', 4, target/5, replaceArray);
		}
	},
	HOURS_BOTTOM{
		@Override
		public String getTime(String time) {
			int target = Integer.parseInt(time);
			char[] replaceArray = {'R','R'};
			return formatToBerlinLamp('O', 4, target%5, replaceArray);
		}
	},
	MINUTES_TOP{
		@Override
		public String getTime(String time) {
			int target = Integer.parseInt(time);
			char[] replaceArray = {'Y','R'};
			return formatToBerlinLamp('O', 11, target/5, replaceArray);
		}
	},
	MINUTES_BOTTOM{
		@Override
		public String getTime(String time) {
			int target = Integer.parseInt(time);
			char[] replaceArray = {'Y','Y'};
			return formatToBerlinLamp('O', 4, target%5, replaceArray);
		}
	},
	SECONDS{
		@Override
		public String getTime(String time) {
			int target = Integer.parseInt(time);
			return target%2==0?"Y":"O";
		}
	};

	public abstract String getTime(String time);
	
	/**
	 * 
	 * @param original - The original/default character for the lamp row
	 * @param iterations - Iterations matching the number of lamps in the row
	 * @param replaceIterations - Iterations to determine the lamps that will be activated
	 * @param replacements the lamp colors for the activated lamps
	 * @return
	 */
	private static final String formatToBerlinLamp(char original,int iterations,int replaceIterations,char[] replacements) {
		StringBuilder builder = new StringBuilder();
		for(int index=1;index<=iterations;index++) {
			if(index<=replaceIterations) {
			builder.append(index%3!=0?replacements[0]:replacements[1]);
			}else {
				builder.append(original);
			}
		}
		return builder.toString();
	}

}
