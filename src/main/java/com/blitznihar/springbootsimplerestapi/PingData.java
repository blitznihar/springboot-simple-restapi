package com.blitznihar.springbootsimplerestapi;

public class PingData {

	public String applicationName;
	public String purpose;
	public String timestamp;

	public PingData() {
	}

	public PingData(String applicationName, String purpose, String timestamp) {
		this.applicationName = applicationName;
		this.purpose = purpose;
		this.timestamp = timestamp;

	}

	@Override
	public String toString() {
		return String.format("PingData[applicationName=%s, purpose='%s', timestamp='%s']", applicationName, purpose,
				timestamp);
	}

}
