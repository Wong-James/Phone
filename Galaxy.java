package com.james.phone;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		String ringer = this.getRingTone();
		return ringer;
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via fingerprint";
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());
	}

}
