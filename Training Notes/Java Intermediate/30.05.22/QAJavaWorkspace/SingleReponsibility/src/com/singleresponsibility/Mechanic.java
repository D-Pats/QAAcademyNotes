package com.singleresponsibility;

public class Mechanic {
	private String serviced;
	
	public void needsService(String serviced) {
		this.setServiced(this.getServiced() + serviced);
	}

	public String getServiced() {
		return serviced;
	}

	public void setServiced(String serviced) {
		this.serviced = serviced;
	}


	
}
