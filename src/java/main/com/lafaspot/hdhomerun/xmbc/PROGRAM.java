package com.lafaspot.hdhomerun.xmbc;

import com.lafaspot.hdhomerun.xmbc.SCANNING.Filter;

class PROGRAM extends SCANOBJ {
	private SCANNING mParent;
	public PROGRAM(SCANNING parent, String line) {
		data = line;
		mParent = parent;
	}
	
	public boolean encrypted() {
		return data.contains("(encrypted)");
	}

	public String description() {		
		int pos = data.indexOf(":");
		String description = data.substring(pos+2);
		if (description.trim().equals("0") || description.trim().equals("")) {
			description = mParent.channel("us-cable") + "-" + number();
		}
		return description;
	}

	public String number() {
		int pos = data.indexOf(":");		
		return data.substring(8, pos);
	}

	public boolean isDescriptionAvailable() {
		int pos = data.indexOf(":");
		String description = data.substring(pos+2);
		if (description.trim().equals("0") || description.trim().equals("")
		    || description.trim().equals("0 (control)")|| description.trim().equals("0 (no data)")) {
			return false;
		}
		return true;
	}

	public boolean isFilterTrue(Filter filter) {
		switch (filter) {
			default:
			case NONE : return false;
			case ENCRYPTED : return encrypted();
			case NODESCRIPTION : return encrypted() || !isDescriptionAvailable();			
		}
	}
}