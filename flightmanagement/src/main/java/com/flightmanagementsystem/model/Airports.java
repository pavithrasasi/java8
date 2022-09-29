package com.flightmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Airports {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private long airportCode;
    @Column(name="airportName")
    private String airportName;
    @Column(name="airportLocation")
    private String airportLocation;
    
    
    
    public Airports(long airportCode, String airportName, String airportLocation) {
		super();
		this.airportCode = airportCode;
		this.airportName = airportName;
		this.airportLocation = airportLocation;
	}
    
	public Airports() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public long getAirportCode() {
        return airportCode;
    }
    public void setAirportCode(long airportCode) {
        this.airportCode = airportCode;
    }
    public String getAirportName() {
        return airportName;
    }
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
    public String getAirportLocation() {
        return airportLocation;
    }
    public void setAirportLocation(String airportLocation) {
        this.airportLocation = airportLocation;
    }
}
