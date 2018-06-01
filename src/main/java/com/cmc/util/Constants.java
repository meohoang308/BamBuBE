package com.cmc.util;

import java.util.HashMap;

public class Constants {
	public static final HashMap<Integer, Integer> SAVING = new HashMap<>();
	 static {
		 SAVING.put(10000, 5);
		 SAVING.put(8000, 4);
		 SAVING.put(6000, 3);
		 SAVING.put(4000, 2);
		 SAVING.put(2000, 1);		
	    }
	 
		public static final HashMap<Integer, Integer> LOAN = new HashMap<>();
		 static {
			 LOAN.put(10000, 1);
			 LOAN.put(8000, 2);
			 LOAN.put(6000, 3);
			 LOAN.put(4000, 4);
			 LOAN.put(2000, 5);		
		    }	
	
	public static class PROFILE {			
		public static final String A = "A";
		public static final String B = "B";
		public static final String C = "C";
		public static final String D = "D";
		public static final String E = "E";		
	}
	
	public static class SCORE {			
		public static final int SCORE_2 = 2;
		public static final int SCORE_4 = 4;
		public static final int SCORE_6 = 6;
		public static final int SCORE_8 = 8;
			
	}

}
