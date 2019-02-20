package com.cts.util;

import java.util.HashMap;

public class ColorConverter {
	
	private static HashMap<String, String> colorTable = new HashMap<>();
	
	static {
		colorTable.put("red", "FF0000");
		colorTable.put("blue", "483D8B");
		colorTable.put("pink", "FFC0CB");
		colorTable.put("black", "000000");
		colorTable.put("green", "008000");
		colorTable.put("grey", "808080");
		colorTable.put("orange", "FFA500");
		colorTable.put("purple", "800080");
		colorTable.put("white", "ffffff");
		colorTable.put("yellow", "FFFF00");
		
	}
	
	public static String getRbgColor(String colorName) {
		if(colorTable.get(colorName.toLowerCase()) != null) {
			return colorTable.get(colorName.toLowerCase());
		}else {
			return "";
		}
		
	}
}
