package com.lafaspot.hdhomerun.xmbc;

import java.util.logging.Logger;

import com.lafaspot.hdhomerun.xmbc.SCANNING.Filter;

public class CreateSTRM {

	private static Logger log = Logger.getLogger("CreateSTRM");
	private static String dir = System.getProperty("user.home") + "/Videos/Live TV";
	
	static public void main(String[] args) {
		HDHomeRunTunner config = new HDHomeRunTunner(1);		
		config.createSTRMFile(dir, Filter.ENCRYPTED);
		//config.playStream("80","1");
	}
}
