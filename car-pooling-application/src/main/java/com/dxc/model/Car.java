package com.dxc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Integer carId;
	 private String carNo;
	 private String carName;
	 private String carColour;
	 public Car() {}
	public Car(Integer carId, String carNo, String carName, String carColour) {
		super();
		this.carId = carId;
		this.carNo = carNo;
		this.carName = carName;
		this.carColour = carColour;
	}
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColour() {
		return carColour;
	}
	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carNo=" + carNo + ", carName=" + carName + ", carColour=" + carColour + "]";
	}
	 
	 

}
