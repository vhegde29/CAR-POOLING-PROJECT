package com.dxc.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class RegularTrip implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer rtripId; 
	private String origin;
	private String destination ;
	@JsonFormat(pattern="HH:MM")
	private Time depTime;
	private int amount;
	private String meetPoint1;
	private String driverId;
	private boolean smoking;
	private boolean pets;
	@JsonFormat(pattern="YYYY-MM-DD")
	private Date depDate;
	@JsonFormat(pattern="YYYY-MM-DD")
	private Date endDate;
	@JsonFormat(pattern="HH:MM")
	private Time endTime;


	public RegularTrip() {}

	public RegularTrip(String string, HttpStatus ok) {
		super();
	}

	public RegularTrip(Integer rtripId, String origin, String destination, Time depTime, int amount, String meetPoint1,
			String driverId, boolean smoking, boolean pets, Date depDate, Date endDate, Time endTime) {
		super();
		this.rtripId = rtripId;
		this.origin = origin;
		this.destination = destination;
		this.depTime = depTime;
		this.amount = amount;
		this.meetPoint1 = meetPoint1;
		this.driverId = driverId;
		this.smoking = smoking;
		this.pets = pets;
		this.depDate = depDate;
		this.endDate = endDate;
		this.endTime = endTime;
	}

	public Integer getRtripId() {
		return rtripId;
	}

	public void setRtripId(Integer rtripId) {
		this.rtripId = rtripId;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Time getDepTime() {
		return depTime;
	}

	public void setDepTime(Time depTime) {
		this.depTime = depTime;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getMeetPoint1() {
		return meetPoint1;
	}

	public void setMeetPoint1(String meetPoint1) {
		this.meetPoint1 = meetPoint1;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public boolean isPets() {
		return pets;
	}

	public void setPets(boolean pets) {
		this.pets = pets;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RegularTrip [rtripId=" + rtripId + ", origin=" + origin + ", destination=" + destination + ", depTime="
				+ depTime + ", amount=" + amount + ", meetPoint1=" + meetPoint1 + ", driverId=" + driverId + ", smoking="
				+ smoking + ", pets=" + pets + ", depDate=" + depDate + ", endDate=" + endDate + ", endTime=" + endTime
				+ "]";
	}
}




	