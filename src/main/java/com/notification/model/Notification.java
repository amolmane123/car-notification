package com.notification.model;

import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

public class Notification {

	String id;
	@PartitionKey
	String vin;
	String eventname;
	String eventval;
	String eventtype;
	String eventdesc;
	String eventdate;
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getEventval() {
		return eventval;
	}
	public void setEventval(String eventval) {
		this.eventval = eventval;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public String getEventdesc() {
		return eventdesc;
	}
	public void setEventdesc(String eventdesc) {
		this.eventdesc = eventdesc;
	}
	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}

	
	public Notification(String vin, String eventname, String eventval, String eventtype, String eventdesc,
			String eventdate) {
		super();
		this.vin = vin;
		this.eventname = eventname;
		this.eventval = eventval;
		this.eventtype = eventtype;
		this.eventdesc = eventdesc;
		this.eventdate = eventdate;
	}
	
	public Notification() {
		super();
	}

	@Override
	public String toString() {
		return "Notification [vin=" + vin + ", eventname=" + eventname + ", eventval=" + eventval
				+ ", eventtype=" + eventtype + ", eventdesc=" + eventdesc + ", eventdate=" + eventdate + "]";
	}
}