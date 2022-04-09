package com.Data.FirstHib;

import javax.persistence.Embeddable;

@Embeddable
public class Midle {
	private String midile;

	public String getMidile() {
		return midile;
	}

	public void setMidile(String midile) {
		this.midile = midile;
	}

	@Override
	public String toString() {
		return "Midle [midile=" + midile + "]";
	}
	

}
